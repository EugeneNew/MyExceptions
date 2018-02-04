package MyExceptionsPackage;

public class GenerateExceptions {
    private String[] a = {"aaaa","bbbbb","ccccc","ddddd"};
    int i = 0;
    public void SortOut(){
        for (i=0;i<5;i++){
            try {
                System.out.println(a[i]);
            }
            catch(RuntimeException e){
                System.out.println("Возникла ошибка: "+e.toString());
               // e.printStackTrace();
            }
        }
    }
}
