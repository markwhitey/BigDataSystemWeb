package com.itwang.pojo;

/**
 * @ProjectName: SchoolBigDataAnalysisWeb
 * @Package: com.itwang.pojo
 * @ClassName: BookBorrowRank
 * @Author: hadoop
 * @Description:
 * @Date: 2019-04-16 21:08
 * @Version: 1.0
 */
public class BookBorrowRank {
    private String title;//借书名字
    private String category;//类别
    private String count;//借阅数量

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BookBorrowRank{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
