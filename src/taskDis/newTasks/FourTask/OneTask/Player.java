package taskDis.newTasks.FourTask.OneTask;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {

        weaponSlots = new Weapon[] {
                new Pistol(),
                new Gun(),
                new RPG(),
                new Slingshot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {

        if (slot < 0 || slot >= weaponSlots.length) {
            System.out.println(" Ошибка! Слота с номером " + slot + " не существует.");
            return; // Выходим из метода
        }


        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}