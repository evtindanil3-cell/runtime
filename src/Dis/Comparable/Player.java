package Dis.Comparable;

import java.util.Objects;

public class Player implements Comparable<Player> {
    String name;
    int level;
    int damage;
    public Player(String name,int level,int damage){
        this.name = name;
        this.level = level;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Comparable.Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", damage=" + damage +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Player player = (Player) object;
        return level == player.level && damage == player.damage && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, damage);
    }

    @Override
    public int compareTo(Player o) {
        int resLevel = Integer.compare(this.level,o.level);
        if (resLevel !=0){
            return resLevel;
        }
        int resDamage = Integer.compare(this.damage,o.damage);
        if (resDamage != 0){
            return resDamage;
        }
        return this.name.compareTo(o.name);
    }
}
