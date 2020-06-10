package org.denis.firstApp.dto;

public class PersonDto {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public static class Builder {
//        private String firstName;
//        private String lastName;
//        private int age;
//
//        public Builder(String firstName, String lastName, int age) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.age = age;
//        }
//
//        public Builder firstName(String var) {
//            this.firstName = var;
//            return this;
//        }
//
//        public Builder lastName(String var) {
//            this.lastName = var;
//            return this;
//        }
//
//        public Builder age(int var) {
//            this.age = var;
//            return this;
//        }
//
//        public PersonDto build() {
//            return new PersonDto(this);
//        }
//    }
}
