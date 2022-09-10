package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class siva {

	public static void main(String[] args) {
		Resource rs =new ClassPathResource(".xml");
		BeanFactory bn=new XmlBeanFactory(rs);
		customer emp=(customer)bn.getBean("cst");
		emp.display();
		

	}

}
