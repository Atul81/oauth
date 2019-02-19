package atul.backend.oauth.service.impl;

import atul.backend.oauth.model.EmailModel;
import atul.backend.oauth.service.EmailService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.mail.internet.MimeMessage;

@Service("mailService")
public class EmailServiceImpl implements EmailService {


    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private Configuration freemarkerConfig;

    public void sendEmail(EmailModel mail) {
        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message);

        // Using a subfolder such as /templates here
        freemarkerConfig.setClassForTemplateLoading(this.getClass(), "/templates");

        Template t = null;
        try {
            t = freemarkerConfig.getTemplate("addingNewUser.ftl");
            String text = FreeMarkerTemplateUtils.processTemplateIntoString(t, mail.getModel());

            helper.setTo(mail.getMailTo());
            helper.setText(text, true);
            helper.setSubject(mail.getMailSubject());
            //helper.addAttachment("Bhosdk", new ClassPathResource("static/attach.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        mailSender.send(message);
    }
}
