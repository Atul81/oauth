package atul.backend.oauth.service;

import atul.backend.oauth.entity.UserEntity;
import atul.backend.oauth.model.EmailModel;
import freemarker.template.TemplateException;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

    void sendEmail(EmailModel emailModel) throws IOException, TemplateException, MessagingException;
}
