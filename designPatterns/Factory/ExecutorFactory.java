/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author udaya
 */
public class ExecutorFactory {
    public static NotificationExecutor getNotificationExecutor(String executerT) {
       if(executerT.equals("EMAIL"))
         return new EmailExecutor();
       if(executerT.equals("SMS"))
         return new SMSExecutor();
       return null;
     } 
}
