/**
 * Created by Тим on 28.03.2017.
 */
public class PaperTray {
    int pages;
    public void addPaper(int count){
        pages+=count;
    }
    public void usePage(){
        pages--;
    }
    public boolean isEmpty(){
        if(pages==0){
            return true;
        }
        else {
        return false;
    }
    }
}
