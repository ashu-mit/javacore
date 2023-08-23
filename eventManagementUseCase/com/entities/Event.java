package eventManagementUseCase.com.entities;

public class Event extends EMBase {


    public String desc;
    public String sTime;
    public String eTime;
    public boolean isStarted;

    public Event(int id,String name,String desc)
    {
    this.id=id;
    this.name=name;
    this.desc=desc;
    }
}
