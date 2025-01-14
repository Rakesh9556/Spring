package org.dev.bean_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Admin {
    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanLifecycleConfig.class);
//        DbConnect db = context.getBean("dbConnect", DbConnect.class);
//        System.out.println("Db object: " + db);
//        db.isConnected();

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        studentDao.selectAllRows();
        // studentDao.deleteRow(1);

        // context.close();
        context.registerShutdownHook();

        StudentDao studentDao2 = context.getBean("studentDao", StudentDao.class);

    }
}
