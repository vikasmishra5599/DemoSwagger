package domain;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "MyResponse", description = "Dummy example")
public class DemoResponse {
    @Schema(name = "NAME", example = "Vikas")
    private String name;
    @Schema
    private int age;

    public DemoResponse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
