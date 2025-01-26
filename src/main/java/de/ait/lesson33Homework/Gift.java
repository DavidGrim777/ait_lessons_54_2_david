package de.ait.lesson33Homework;

public class Gift {

    private String name;              //— название подарка.
    private GiftCategory category;    //— категория подарка (используйте enum GiftCategory).
    private GiftStatus status;        //— статус подарка (используйте enum GiftStatus).

    public Gift(String name, GiftCategory category, GiftStatus status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public GiftCategory getCategory() {
        return category;
    }

    public GiftStatus getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(GiftCategory category) {
        this.category = category;
    }

    public void setStatus(GiftStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", status=" + status +
                '}';
    }

}
