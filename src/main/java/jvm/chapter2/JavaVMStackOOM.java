package jvm.chapter2;

/**
 * VM Args�?-Xss2M （这时�?�不妨设大些�?
 * @author zzm
 */
public class JavaVMStackOOM {
 
       private void dontStop() {
              while (true) {
              }
       }
 
       public void stackLeakByThread() {
              while (true) {
                     Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                   dontStop();
                            }
                     });
                     thread.start();
              }
       }
 
       public static void main(String[] args) throws Throwable {
              JavaVMStackOOM oom = new JavaVMStackOOM();
              oom.stackLeakByThread();
       }
}

