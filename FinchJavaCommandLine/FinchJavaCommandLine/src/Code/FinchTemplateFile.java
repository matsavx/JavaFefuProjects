package Code;
// Needs a package declaration to move to another folder

import com.birdbraintechnologies.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();

      int rightVelocity = 92;
      int leftVelocity = 100;
//      int time = 500;
//      int calcTime = 0;
//      int length;
//      int weight;
//
//      while (!myFinch.isObstacle()) { //�� ������ ������
//         myFinch.setWheelVelocities(leftVelocity, rightVelocity, time);
//      }
//      myFinch.setWheelVelocities(-100, -100, 700); //����� �����
//      myFinch.sleep(1000);
//
//      myFinch.setWheelVelocities(255, -255, 740); //��������
//      myFinch.setWheelVelocities(-100, -100, 400); //����� ����� ������� �� ������
//
//      myFinch.sleep(1000);
//
//      while (!myFinch.isObstacle() || !myFinch.isObstacleRightSide() || !myFinch.isObstacleLeftSide()) { //���� �� ������ ��������
//         myFinch.setWheelVelocities(leftVelocity, rightVelocity, time);
//
//         calcTime += time;
//      }
//      length = (calcTime/1000) * ((rightVelocity + leftVelocity)/20) + 25; //20 - ����� ������ + 10 �� �� �� �������� ���� �������
//      System.out.println(length);
//
//      myFinch.setWheelVelocities(-100, -100, 1000); //����� �����
//      myFinch.setWheelVelocities(-255, 255, 365); //������� �� 90 ��������
//
//      calcTime = 0;
//
//
//         while (!myFinch.isObstacle()) {
//         myFinch.setWheelVelocities(leftVelocity, rightVelocity, time);
//      }
//      myFinch.setWheelVelocities(-100, -100, 500);
//      myFinch.sleep(1000);
//
//      myFinch.setWheelVelocities(-255, 255, 655);
//      myFinch.setWheelVelocities(-100, -100, 1000);
//
//      myFinch.sleep(1000);
//
//      while (!myFinch.isObstacle() || !myFinch.isObstacleRightSide() || !myFinch.isObstacleLeftSide()) {
//         myFinch.setWheelVelocities(leftVelocity, rightVelocity, time);
//
//         calcTime += time;
//      }
//
//      weight = (calcTime/1000) * ((rightVelocity + leftVelocity)/20) + 25;
//
//      System.out.println(weight);
//      System.out.println(length*weight);

         myFinch.setWheelVelocities(leftVelocity,rightVelocity, 1000);
         myFinch.setWheelVelocities(100,0, 500);
         myFinch.setWheelVelocities(0,200, 500);
         myFinch.setLED(0,255,0);
         myFinch.sleep(500);
         myFinch.setLED(0,0,255);
         myFinch.sleep(500);
         myFinch.setLED(255,0,0);
         myFinch.sleep(500);

//      myFinch.setWheelVelocities(-100, -100, 2000);

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

