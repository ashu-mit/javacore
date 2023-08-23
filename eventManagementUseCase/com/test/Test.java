package eventManagementUseCase.com.test;

import eventManagementUseCase.com.entities.Event;
import eventManagementUseCase.com.entities.Organizer;

public class Test {
    public static void main(String[] args) {
        Organizer organizer=new Organizer();
        organizer.id=123l;
        organizer.name="Apple Inc";
        System.out.println(organizer);
        System.out.println(organizer.name);


        Event event=new Event(456,"iphone 16 launch","grand Launch");


        System.out.println(event.desc);
    }
}
