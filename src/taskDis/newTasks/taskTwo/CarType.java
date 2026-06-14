package taskDis.newTasks.taskTwo;

public class CarType extends VehicleTypeByPurpose{

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
