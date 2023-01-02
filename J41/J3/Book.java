package J41.J3;

public class Book {
    public String name,author,publisher;
    private int pageNum;
    Book(String name,int pageNum,String author,String publisher){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if(pageNum < 1){
            this.pageNum = 10;
        }else{
            this.pageNum = pageNum;
        }

    }
    public void pageSize(){
        System.out.println(this.pageNum);
    }

}
