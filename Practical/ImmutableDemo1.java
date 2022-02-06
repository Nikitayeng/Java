package nikita_code;
public final class ImmutableDemo1 {
private String name;
ImmutableDemo1 (String name) {
this.name = name;
}
public String getName() {
return name;
}

public static void main(String[] args) {
ImmutableDemo1 obj = new ImmutableDemo1("hello");
System.out.println(obj.getName());
//obj.setName("new hello");
//System.out.println(obj.getName());
}
}