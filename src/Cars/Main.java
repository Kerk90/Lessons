
package Cars;


public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Ferrari();
        cars[1] = new Mercedes();
        cars[2] = new Toyota();
        cars[3] = new Nissan();

        for (Car car : cars) {
            car.forward();

//�������� ������ ������� ����� � ������ �����
//����������� ����������� ����� Car  � ������� Forward
//����������� ������ ����� �����, ������� ����� ����������� Car � �� ������ ������������� ����� Forward
//������� �� �������� ��������� ������� �����
            //System.out.println("");
        }
    }
}
