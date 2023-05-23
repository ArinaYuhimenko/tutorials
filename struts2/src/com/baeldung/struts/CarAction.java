package com.baeldung.struts;

public class Car {

    private String Name;
    private String Message;
    private CarMessageService MessageService = new MessageService();

    public String execute() {
        System.out.println("inside execute(): car Name is" + Name);
        this.setMessage(this.MessageService.getMessage(Name));
        return "success";
    }

    public String getName() {
        return carName;
    }

    public void setName(String Name) {
        this.carName = carName;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

}
