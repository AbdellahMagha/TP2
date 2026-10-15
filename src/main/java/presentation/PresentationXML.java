package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXML {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metierBean = (IMetier) applicationContext.getBean("metier");
        System.out.println("Résultat (XML) = " + metierBean.calcul());
    }
}
