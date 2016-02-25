package foo.bar.performers;


import java.util.List;

public class Groups implements Performer{
    public void setGroup(List<Group> group) {
        this.group = group;
    }

    List< Group> group;

    @Override
    public void perform() {
for(Group group:group) {
    System.out.println(group);
}

    }
}

