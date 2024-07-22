public class ClassRoom {

   private int tableNum;

   private String bookName;


    public ClassRoom() {
    }

//    public ClassRoom(int tableNum) {
//        this.tableNum = tableNum;
//    }
//
//    public ClassRoom(int tableNum, String bookName) {
//        this.tableNum = tableNum;
//        this.bookName = bookName;
//    }


    public int getTableNum() {
        return tableNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
