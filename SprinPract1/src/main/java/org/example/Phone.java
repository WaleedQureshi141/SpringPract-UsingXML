package org.example;

public class Phone
{
    private String mob;

    public void setMob(String mob)
    {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
