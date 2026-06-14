package taskDis.newTasks.taskTwo;

public class Main {
    static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом

        VehicleAd merseAd = new VehicleAd("merse", "1", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd ladaAD = new VehicleAd("lada", "2", new PassengerType(),
                new PickupType(), new DieselType());
        VehicleAd breadAD = new VehicleAd("bread", "3", new TruckType(),
                new SedanType(), new PetrolType());
        VehicleAd teslaAD = new VehicleAd("tesla", "4", new PassengerType(),
                new PickupType(), new ElectricType());
        adsService.setAdList(new VehicleAd[] {merseAd, ladaAD, breadAD, teslaAD});

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());


    }
}
