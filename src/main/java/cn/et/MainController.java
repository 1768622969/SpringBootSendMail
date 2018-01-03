package cn.et;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	private JavaMailSender jms;
	
	@GetMapping("/send")
	public String send(String message){
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom("shijieheping5257@126.com");	
		smm.setTo("1768622969@qq.com");
		smm.setSubject("世界和平");
		smm.setText("你好，世界！");
		jms.send(smm);
		return "发送成功";
	}
}
