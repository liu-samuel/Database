import java.util.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Dimension;

import java.sql.*;
public class Database extends JFrame implements ActionListener
{
    String inputStudentID;
    String inputTeacherID;
    String inputCourseID;
    int inputX = 100;
    int inputY = 150;
    int headerX = 405;
    int headerY = 20;
    int distanceX = 300;
    int distanceY = 100;
    int font = 24;
    int buttonY = 200;
    int frameX = 410;
    int frameY = 200;
    int frameSizeX = 1000;
    int frameSizeY = 600;
    int buttonSizeX = 200;
    int buttonSizeY = 100;
    int inputSizeX = 200;
    int inputSizeY = 50;
    int inputLabelY = 145;
    int columns = 20;
    int submitButtonX = 750;
    int submitButtonY = 425;
    int clearButtonX = 550;
    int clearButtonY = 425;
    int distanceFrame = 100;
    String student_seq;
    String teacher_seq;
    String course_seq;
    String strStudentID;
    int intStudentID;
    String strTeacherID;
    int intTeacherID;
    String strCourseID;
    int intCourseID;
    
    
    String database = "jdbc:oracle:thin:@localhost:1521:samDB";
    String username = "sam";
    String password = "12345";
    //buttons
    JButton b1 = new JButton("Student Table");
    JButton b2 = new JButton("Teacher Table");
    JButton b3 = new JButton("Course Table");
    JButton b1a = new JButton("Add student");
    JButton b1b = new JButton("Update");
    JButton b2a = new JButton("Add New Teacher");
    JButton b2b = new JButton("Update");
    JButton b3a = new JButton("Add Course Student");
    JButton b3b = new JButton("Update");
    
    JButton updateStudentButton = new JButton();
    JButton submitStudentAdd = new JButton("Submit");
    JButton submitStudentUpdate = new JButton("Submit");
    JButton clearAll1 = new JButton("Clear");
    
    JButton updateTeacherButton = new JButton();
    JButton submitTeacherAdd = new JButton("Submit");
    JButton submitTeacherUpdate = new JButton("Submit");
    JButton clearAll2 = new JButton("Clear");
    
    JButton updateCourseButton = new JButton();
    JButton submitCourseAdd = new JButton("Submit");
    JButton submitCourseUpdate = new JButton("Submit");
    JButton clearAll3 = new JButton("Clear");
    //frames
    JFrame frame1 = new JFrame();
    JFrame frame2a = new JFrame();
    JFrame frame2b = new JFrame();
    JFrame frame2c = new JFrame();
    JFrame frame2a1 = new JFrame();
    JFrame frame2a2 = new JFrame();
    JFrame frame2b1 = new JFrame();
    JFrame frame2b2 = new JFrame();
    JFrame frame2c1 = new JFrame();
    JFrame frame2c2 = new JFrame();
    JFrame updateInfoStudent = new JFrame();
    JFrame updateInfoTeacher = new JFrame();
    JFrame updateInfoCourse = new JFrame();
    Interface x = new Interface();
    //student textfields
    JTextField first = new JTextField("First Name");
    JTextField last = new JTextField("Last Name");
    JTextField birthdate = new JTextField("Birthdate");
    JTextField studentID = new JTextField("Student ID");
    JTextField phoneNum = new JTextField("Phone Number");
    JTextField email = new JTextField("Email");
    JTextField gender = new JTextField("Gender");
    JTextField address = new JTextField("Address");
    JTextField school = new JTextField("School");
    
    JTextField updateStudentID = new JTextField("Student ID");
    
    JTextField updateFName = new JTextField();
    JTextField updateLName = new JTextField("Last Name");
    JTextField updateBirthdate = new JTextField("Birthdate");
    JTextField updatePhoneNum = new JTextField("Phone Number");
    JTextField updateEmail = new JTextField("Email");
    JTextField updateGender = new JTextField("Gender");
    JTextField updateAddress = new JTextField("Address");
    JTextField updateSchool = new JTextField("School");
    
    //teacher textfields
    JTextField firstT = new JTextField("First Name");
    JTextField lastT = new JTextField("First Name");
    JTextField birthdateT = new JTextField("First Name");
    JTextField addressT = new JTextField("First Name");
    JTextField phoneNumT = new JTextField("First Name");
    JTextField emailT = new JTextField("First Name");
    JTextField genderT = new JTextField("First Name");
    JTextField courseT = new JTextField("First Name");
    
    JTextField updateTeacher = new JTextField("Teacher ID");
    
    JTextField updateFNameT = new JTextField();
    JTextField updateLNameT = new JTextField("Last Name");
    JTextField updateBirthdateT = new JTextField("Birthdate");
    JTextField updatePhoneNumT = new JTextField("Phone Number");
    JTextField updateEmailT = new JTextField("Email");
    JTextField updateGenderT = new JTextField("Gender");
    JTextField updateAddressT = new JTextField("Address");
    JTextField updateCourseT = new JTextField("School");  
    //course textfields
    JTextField courseName = new JTextField("");
    JTextField courseRoom = new JTextField("");
    JTextField courseTeacher = new JTextField("");
    
    JTextField updateCourse = new JTextField("");
    
    JTextField updateNameC = new JTextField();
    JTextField updateRoomC = new JTextField("Last Name");
    JTextField updateTeacherC = new JTextField("Birthdate");
    //labels for students
    JLabel studentLabel = new JLabel("Add Student");
    JLabel firstName = new JLabel();
    JLabel lastName = new JLabel();
    JLabel birthday = new JLabel();
    JLabel phoneNumber = new JLabel();
    JLabel studentEmail = new JLabel();
    JLabel studentGender = new JLabel();
    JLabel studentAddress = new JLabel();
    JLabel studentSchool = new JLabel();
    
    JLabel studentUpdateLabel = new JLabel();
    
    JLabel updateStudentLabel = new JLabel();
    JLabel studentLabelUpdate = new JLabel("Add Student");
    JLabel updateFirstName = new JLabel();
    JLabel updateLastName = new JLabel();
    JLabel updateBirthday = new JLabel();
    JLabel updatePhoneNumber = new JLabel();
    JLabel updateStudentEmail = new JLabel();
    JLabel updateStudentGender = new JLabel();
    JLabel updateStudentAddress = new JLabel();
    JLabel updateStudentSchool = new JLabel();
    
    //labels for teachers
    JLabel teacherLabel = new JLabel("Add Student");
    JLabel firstNameT = new JLabel();
    JLabel lastNameT = new JLabel();
    JLabel birthdayT = new JLabel();
    JLabel phoneNumberT = new JLabel();
    JLabel teacherEmail = new JLabel();
    JLabel teacherGender = new JLabel();
    JLabel teacherAddress = new JLabel();
    JLabel teacherCourse = new JLabel();
    
    JLabel teacherUpdateLabel = new JLabel();
    
    JLabel updateTeacherLabel = new JLabel();
    JLabel teacherLabelUpdate = new JLabel("Add Student");
    JLabel updateFirstNameT = new JLabel();
    JLabel updateLastNameT = new JLabel();
    JLabel updateBirthdayT = new JLabel();
    JLabel updatePhoneNumberT = new JLabel();
    JLabel updateTeacherEmail = new JLabel();
    JLabel updateTeacherGender = new JLabel();
    JLabel updateTeacherAddress = new JLabel();
    JLabel updateTeacherCourse = new JLabel();
    //course labels
    JLabel courseLabel = new JLabel();
    JLabel course = new JLabel("");
    JLabel room = new JLabel("");
    JLabel teacher = new JLabel("");
    
    JLabel courseUpdateLabel = new JLabel();
    
    JLabel updateCourseLabel = new JLabel();
    JLabel updateCourseName = new JLabel();
    JLabel updateCourseRoom = new JLabel();
    JLabel updateCourseTeacher = new JLabel();
    public Database()
    {     
        System.out.print('\u000C');

        //JLabel
        studentLabel.setVisible(true);
        studentLabel.setLocation(headerX, headerY);
        studentLabel.setText("Add Student");
        studentLabel.setSize(200, 150);
        studentLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        firstName.setVisible(true);
        firstName.setLocation(inputX, inputLabelY);
        firstName.setText("First Name");
        firstName.setSize(200, 150);
        firstName.setFont(new Font("Calibri", Font.PLAIN, font));
        
        lastName.setVisible(true);
        lastName.setLocation(inputX + distanceX, inputLabelY);
        lastName.setText("Last Name");
        lastName.setSize(200, 150);
        lastName.setFont(new Font("Calibri", Font.PLAIN, font));
        
        birthday.setVisible(true);
        birthday.setLocation(inputX + 2*distanceX, inputLabelY);
        birthday.setText("Birthdate");
        birthday.setSize(200, 150);
        birthday.setFont(new Font("Calibri", Font.PLAIN, font));
        
        phoneNumber.setVisible(true);
        phoneNumber.setLocation(inputX, inputLabelY + distanceY);
        phoneNumber.setText("Phone Number");
        phoneNumber.setSize(200, 150);
        phoneNumber.setFont(new Font("Calibri", Font.PLAIN, font));
        
        studentEmail.setVisible(true);
        studentEmail.setLocation(inputX + distanceX, inputLabelY + distanceY);
        studentEmail.setText("Email");
        studentEmail.setSize(200, 150);
        studentEmail.setFont(new Font("Calibri", Font.PLAIN, font));
        
        studentGender.setVisible(true);
        studentGender.setLocation(inputX + 2*distanceX, inputLabelY + distanceY);
        studentGender.setText("Sex");
        studentGender.setSize(200, 150);
        studentGender.setFont(new Font("Calibri", Font.PLAIN, font));
        
        studentAddress.setVisible(true);
        studentAddress.setLocation(inputX, inputLabelY + 2*(distanceY));
        studentAddress.setText("Address");
        studentAddress.setSize(200, 150);
        studentAddress.setFont(new Font("Calibri", Font.PLAIN, font));
        
        studentSchool.setVisible(true);
        studentSchool.setLocation(inputX + distanceX, inputLabelY + 2*(distanceY));
        studentSchool.setText("School");
        studentSchool.setSize(200, 150);
        studentSchool.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //input student
        first.setColumns(columns);
        first.setVisible(true);
        first.setLocation(inputX, inputY);
        first.setSize(inputSizeX, inputSizeY);
        first.setText("");
        first.setFont(new Font("Calibri", Font.PLAIN, font));
        
        last.setColumns(columns);
        last.setVisible(true);
        last.setLocation(inputX + distanceX, inputY);
        last.setSize(inputSizeX, inputSizeY);
        last.setText("");
        last.setFont(new Font("Calibri", Font.PLAIN, font));
        
        birthdate.setColumns(columns);
        birthdate.setVisible(true);
        birthdate.setLocation(inputX + 2*(distanceX), inputY);
        birthdate.setSize(inputSizeX, inputSizeY);
        birthdate.setText("");
        birthdate.setFont(new Font("Calibri", Font.PLAIN, font));
        
        phoneNum.setColumns(columns);
        phoneNum.setVisible(true);
        phoneNum.setLocation(inputX, inputY + distanceY);
        phoneNum.setSize(inputSizeX, inputSizeY);
        phoneNum.setText("");
        phoneNum.setFont(new Font("Calibri", Font.PLAIN, font));
        
        email.setColumns(columns);
        email.setVisible(true);
        email.setLocation(inputX + distanceX, inputY + distanceY);
        email.setSize(inputSizeX, inputSizeY);
        email.setText("");
        email.setFont(new Font("Calibri", Font.PLAIN, font));
        
        gender.setColumns(columns);
        gender.setVisible(true);
        gender.setLocation(inputX + 2*(distanceX), inputY + distanceY);
        gender.setSize(inputSizeX, inputSizeY);
        gender.setText("");
        gender.setFont(new Font("Calibri", Font.PLAIN, font));
        
        address.setColumns(columns);
        address.setVisible(true);
        address.setLocation(inputX, inputY + 2*(distanceY));
        address.setSize(inputSizeX, inputSizeY);
        address.setText("");
        address.setFont(new Font("Calibri", Font.PLAIN, font));
        
        school.setColumns(columns);
        school.setVisible(true);
        school.setLocation(inputX + distanceX, inputY + 2*(distanceY));
        school.setSize(inputSizeX, inputSizeY);
        school.setText("");
        school.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateStudentID.setColumns(columns);
        updateStudentID.setVisible(true);
        updateStudentID.setLocation(inputX + distanceX, inputY);
        updateStudentID.setSize(inputSizeX, inputSizeY);
        updateStudentID.setText("");
        updateStudentID.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //update labels
        studentUpdateLabel.setVisible(true);
        studentUpdateLabel.setLocation(headerX, headerY);
        studentUpdateLabel.setText("Student Update");
        studentUpdateLabel.setSize(400, 150);
        studentUpdateLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateStudentLabel.setVisible(true);
        updateStudentLabel.setLocation(headerX, headerY);
        updateStudentLabel.setText("Enter ID for Student to be Updated");
        updateStudentLabel.setSize(1000, 150);
        updateStudentLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherUpdateLabel.setVisible(true);
        teacherUpdateLabel.setLocation(headerX, headerY);
        teacherUpdateLabel.setText("Enter Teacher ID");
        teacherUpdateLabel.setSize(200, 150);
        teacherUpdateLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        courseUpdateLabel.setVisible(true);
        courseUpdateLabel.setLocation(headerX, headerY);
        courseUpdateLabel.setText("Enter Course ID");
        courseUpdateLabel.setSize(200, 150);
        courseUpdateLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        //teacher label
        teacherLabel.setVisible(true);
        teacherLabel.setLocation(headerX, headerY);
        teacherLabel.setText("Add Teacher");
        teacherLabel.setSize(200, 150);
        teacherLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        firstNameT.setVisible(true);
        firstNameT.setLocation(inputX, inputLabelY);
        firstNameT.setText("First Name");
        firstNameT.setSize(200, 150);
        firstNameT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        lastNameT.setVisible(true);
        lastNameT.setLocation(inputX + distanceX, inputLabelY);
        lastNameT.setText("Last Name");
        lastNameT.setSize(200, 150);
        lastNameT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        birthdayT.setVisible(true);
        birthdayT.setLocation(inputX + 2*(distanceX), inputLabelY);
        birthdayT.setText("Birthdate");
        birthdayT.setSize(200, 150);
        birthdayT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        phoneNumberT.setVisible(true);
        phoneNumberT.setLocation(inputX, inputLabelY + distanceY);
        phoneNumberT.setText("Phone Number");
        phoneNumberT.setSize(200, 150);
        phoneNumberT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherEmail.setVisible(true);
        teacherEmail.setLocation(inputX + distanceX, inputLabelY + distanceY);
        teacherEmail.setText("Email");
        teacherEmail.setSize(200, 150);
        teacherEmail.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherGender.setVisible(true);
        teacherGender.setLocation(inputX + 2*(distanceX), inputLabelY + distanceY);
        teacherGender.setText("Sex");
        teacherGender.setSize(200, 150);
        teacherGender.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherAddress.setVisible(true);
        teacherAddress.setLocation(inputX, inputLabelY + 2*(distanceY));
        teacherAddress.setText("Address");
        teacherAddress.setSize(200, 150);
        teacherAddress.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherCourse.setVisible(true);
        teacherCourse.setLocation(inputX + distanceX, inputLabelY + 2*(distanceY));
        teacherCourse.setText("Course");
        teacherCourse.setSize(200, 150);
        teacherCourse.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //teacher input
        firstT.setColumns(columns);
        firstT.setVisible(true);
        firstT.setLocation(inputX, inputY);
        firstT.setText("");
        firstT.setSize(inputSizeX, inputSizeY);
        firstT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        lastT.setColumns(columns);
        lastT.setVisible(true);
        lastT.setLocation(inputX + distanceX, inputY);
        lastT.setText("");
        lastT.setSize(inputSizeX, inputSizeY);
        lastT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        birthdateT.setColumns(columns);
        birthdateT.setVisible(true);
        birthdateT.setLocation(inputX + 2*(distanceX), inputY);
        birthdateT.setText("");
        birthdateT.setSize(inputSizeX, inputSizeY);
        birthdateT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        phoneNumT.setColumns(columns);
        phoneNumT.setVisible(true);
        phoneNumT.setLocation(inputX, inputY + distanceY);
        phoneNumT.setText("");
        phoneNumT.setSize(inputSizeX, inputSizeY);
        phoneNumT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        emailT.setColumns(columns);
        emailT.setVisible(true);
        emailT.setLocation(inputX + (distanceX), inputY + distanceY);
        emailT.setText("");
        emailT.setSize(inputSizeX, inputSizeY);
        emailT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        genderT.setColumns(columns);
        genderT.setVisible(true);
        genderT.setLocation(inputX + 2*(distanceX), inputY + (distanceY));
        genderT.setText("");
        genderT.setSize(inputSizeX, inputSizeY);
        genderT.setFont(new Font("Calibri", Font.PLAIN, font));
              
        addressT.setColumns(columns);
        addressT.setVisible(true);
        addressT.setLocation(inputX, inputY + 2*(distanceY));
        addressT.setText("");
        addressT.setSize(inputSizeX, inputSizeY);
        addressT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        courseT.setColumns(columns);
        courseT.setVisible(true);
        courseT.setLocation(inputX + distanceX, inputY + 2*(distanceY));
        courseT.setText("");
        courseT.setSize(inputSizeX, inputSizeY);
        courseT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateTeacher.setColumns(columns);
        updateTeacher.setVisible(true);
        updateTeacher.setLocation(inputX + distanceX, inputY);
        updateTeacher.setSize(inputSizeX, inputSizeY);
        updateTeacher.setText("");
        updateTeacher.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //course label
        courseLabel.setVisible(true);
        courseLabel.setLocation(headerX, headerY);
        courseLabel.setText("Course Name");
        courseLabel.setSize(200, 150);
        courseLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        course.setVisible(true);
        course.setLocation(inputX, inputLabelY + distanceY);
        course.setText("Course Name");
        course.setSize(200, 150);
        course.setFont(new Font("Calibri", Font.PLAIN, font));
        
        room.setVisible(true);
        room.setLocation(inputX + distanceX, inputLabelY + distanceY);
        room.setText("Room Number");
        room.setSize(200, 150);
        room.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacher.setVisible(true);
        teacher.setLocation(inputX + 2*(distanceX), inputLabelY + distanceY);
        teacher.setText("Teacher");
        teacher.setSize(200, 150);
        teacher.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateCourseLabel.setVisible(true);
        updateCourseLabel.setLocation(headerX, headerY);
        updateCourseLabel.setText("Update Course");
        updateCourseLabel.setSize(200, 150);
        updateCourseLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //course input
        courseName.setColumns(columns);
        courseName.setVisible(true);
        courseName.setLocation(inputX, inputY + distanceY);
        courseName.setSize(inputSizeX, inputSizeY);
        courseName.setText("");
        courseName.setFont(new Font("Calibri", Font.PLAIN, font));
        
        courseRoom.setColumns(columns);
        courseRoom.setVisible(true);
        courseRoom.setLocation(inputX + distanceX, inputY + distanceY);
        courseRoom.setSize(inputSizeX, inputSizeY);
        courseRoom.setText("");
        courseRoom.setFont(new Font("Calibri", Font.PLAIN, font));
        
        courseTeacher.setColumns(columns);
        courseTeacher.setVisible(true);
        courseTeacher.setLocation(inputX + 2*(distanceX), inputY + distanceY);
        courseTeacher.setSize(inputSizeX, inputSizeY);
        courseTeacher.setText("");
        courseTeacher.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateCourse.setColumns(columns);
        updateCourse.setVisible(true);
        updateCourse.setLocation(inputX + distanceX, inputY);
        updateCourse.setSize(inputSizeX, inputSizeY);
        updateCourse.setText("");
        updateCourse.setFont(new Font("Calibri", Font.PLAIN, font));
        //UPDATE STUDENT

        studentLabelUpdate.setVisible(true);
        studentLabelUpdate.setLocation(headerX, headerY);
        studentLabelUpdate.setText("Update Student");
        studentLabelUpdate.setSize(200, 150);
        studentLabelUpdate.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateFirstName.setVisible(true);
        updateFirstName.setLocation(inputX, inputLabelY);
        updateFirstName.setText("First Name");
        updateFirstName.setSize(200, 150);
        updateFirstName.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateLastName.setVisible(true);
        updateLastName.setLocation(inputX + distanceX, inputLabelY);
        updateLastName.setText("Last Name");
        updateLastName.setSize(200, 150);
        updateLastName.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateBirthday.setVisible(true);
        updateBirthday.setLocation(inputX + 2*distanceX, inputLabelY);
        updateBirthday.setText("Birthdate");
        updateBirthday.setSize(200, 150);
        updateBirthday.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updatePhoneNumber.setVisible(true);
        updatePhoneNumber.setLocation(inputX, inputLabelY + distanceY);
        updatePhoneNumber.setText("Phone Number");
        updatePhoneNumber.setSize(200, 150);
        updatePhoneNumber.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateStudentEmail.setVisible(true);
        updateStudentEmail.setLocation(inputX + distanceX, inputLabelY + distanceY);
        updateStudentEmail.setText("Email");
        updateStudentEmail.setSize(200, 150);
        updateStudentEmail.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateStudentGender.setVisible(true);
        updateStudentGender.setLocation(inputX + 2*distanceX, inputLabelY + distanceY);
        updateStudentGender.setText("Sex");
        updateStudentGender.setSize(200, 150);
        updateStudentGender.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateStudentAddress.setVisible(true);
        updateStudentAddress.setLocation(inputX, inputLabelY + 2*distanceY);
        updateStudentAddress.setText("Address");
        updateStudentAddress.setSize(200, 150);
        updateStudentAddress.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateStudentSchool.setVisible(true);
        updateStudentSchool.setLocation(inputX + distanceX, inputLabelY + 2*distanceY);
        updateStudentSchool.setText("School");
        updateStudentSchool.setSize(200, 150);
        updateStudentSchool.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateFName.setColumns(columns);
        updateFName.setVisible(true);
        updateFName.setLocation(inputX, inputY);
        updateFName.setSize(inputSizeX, inputSizeY);
        updateFName.setText("");
        updateFName.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateLName.setColumns(columns);
        updateLName.setVisible(true);
        updateLName.setLocation(inputX + distanceX, inputY);
        updateLName.setSize(inputSizeX, inputSizeY);
        updateLName.setText("");
        updateLName.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateBirthdate.setColumns(columns);
        updateBirthdate.setVisible(true);
        updateBirthdate.setLocation(inputX + 2*distanceX, inputY);
        updateBirthdate.setSize(inputSizeX, inputSizeY);
        updateBirthdate.setText("");
        updateBirthdate.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updatePhoneNum.setColumns(columns);
        updatePhoneNum.setVisible(true);
        updatePhoneNum.setLocation(inputX, inputY + distanceY);
        updatePhoneNum.setSize(inputSizeX, inputSizeY);
        updatePhoneNum.setText("");
        updatePhoneNum.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateEmail.setColumns(columns);
        updateEmail.setVisible(true);
        updateEmail.setLocation(inputX + distanceX, inputY + distanceY);
        updateEmail.setSize(inputSizeX, inputSizeY);
        updateEmail.setText("");
        updateEmail.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateGender.setColumns(columns);
        updateGender.setVisible(true);
        updateGender.setLocation(inputX + 2*distanceX, inputY + distanceY);
        updateGender.setSize(inputSizeX, inputSizeY);
        updateGender.setText("");
        updateGender.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateAddress.setColumns(columns);
        updateAddress.setVisible(true);
        updateAddress.setLocation(inputX, inputY + 2*distanceY);
        updateAddress.setSize(inputSizeX, inputSizeY);
        updateAddress.setText("");
        updateAddress.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateSchool.setColumns(columns);
        updateSchool.setVisible(true);
        updateSchool.setLocation(inputX + distanceX, inputY + 2*distanceY);
        updateSchool.setSize(inputSizeX, inputSizeY);
        updateSchool.setText("");
        updateSchool.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //UPDATE TEACHER
        updateTeacherLabel.setVisible(true);
        updateTeacherLabel.setLocation(headerX, headerY);
        updateTeacherLabel.setText("Update Teacher");
        updateTeacherLabel.setSize(200, 150);
        updateTeacherLabel.setFont(new Font("Calibri", Font.PLAIN, font));
       
        updateFirstNameT.setVisible(true);
        updateFirstNameT.setLocation(inputX, inputLabelY);
        updateFirstNameT.setText("First Name");
        updateFirstNameT.setSize(200, 150);
        updateFirstNameT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateLastNameT.setVisible(true);
        updateLastNameT.setLocation(inputX + distanceX, inputLabelY);
        updateLastNameT.setText("Last Name");
        updateLastNameT.setSize(200, 150);
        updateLastNameT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateBirthdayT.setVisible(true);
        updateBirthdayT.setLocation(inputX + 2*distanceX, inputLabelY);
        updateBirthdayT.setText("Birthdate");
        updateBirthdayT.setSize(200, 150);
        updateBirthdayT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updatePhoneNumberT.setVisible(true);
        updatePhoneNumberT.setLocation(inputX, inputLabelY + distanceY);
        updatePhoneNumberT.setText("Phone Number");
        updatePhoneNumberT.setSize(200, 150);
        updatePhoneNumberT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateTeacherEmail.setVisible(true);
        updateTeacherEmail.setLocation(inputX + distanceX, inputLabelY + distanceY);
        updateTeacherEmail.setText("Email");
        updateTeacherEmail.setSize(200, 150);
        updateTeacherEmail.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateTeacherGender.setVisible(true);
        updateTeacherGender.setLocation(inputX + 2*distanceX, inputLabelY + distanceY);
        updateTeacherGender.setText("Sex");
        updateTeacherGender.setSize(200, 150);
        updateTeacherGender.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateTeacherAddress.setVisible(true);
        updateTeacherAddress.setLocation(inputX, inputLabelY + 2*distanceY);
        updateTeacherAddress.setText("Address");
        updateTeacherAddress.setSize(200, 150);
        updateTeacherAddress.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateTeacherCourse.setVisible(true);
        updateTeacherCourse.setLocation(inputX + distanceX, inputLabelY + 2*distanceY);
        updateTeacherCourse.setText("Course");
        updateTeacherCourse.setSize(200, 150);
        updateTeacherCourse.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateFNameT.setColumns(columns);
        updateFNameT.setVisible(true);
        updateFNameT.setLocation(inputX, inputY);
        updateFNameT.setSize(inputSizeX, inputSizeY);
        updateFNameT.setText("");
        updateFNameT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateLNameT.setColumns(columns);
        updateLNameT.setVisible(true);
        updateLNameT.setLocation(inputX + distanceX, inputY);
        updateLNameT.setSize(inputSizeX, inputSizeY);
        updateLNameT.setText("");
        updateLNameT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateBirthdateT.setColumns(columns);
        updateBirthdateT.setVisible(true);
        updateBirthdateT.setLocation(inputX + 2*distanceX, inputY);
        updateBirthdateT.setSize(inputSizeX, inputSizeY);
        updateBirthdateT.setText("");
        updateBirthdateT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updatePhoneNumT.setColumns(columns);
        updatePhoneNumT.setVisible(true);
        updatePhoneNumT.setLocation(inputX, inputY + distanceY);
        updatePhoneNumT.setSize(inputSizeX, inputSizeY);
        updatePhoneNumT.setText("");
        updatePhoneNumT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateEmailT.setColumns(columns);
        updateEmailT.setVisible(true);
        updateEmailT.setLocation(inputX + distanceX, inputY + distanceY);
        updateEmailT.setSize(inputSizeX, inputSizeY);
        updateEmailT.setText("");
        updateEmailT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateGenderT.setColumns(columns);
        updateGenderT.setVisible(true);
        updateGenderT.setLocation(inputX + 2*distanceX, inputY + distanceY);
        updateGenderT.setSize(inputSizeX, inputSizeY);
        updateGenderT.setText("");
        updateGenderT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateAddressT.setColumns(columns);
        updateAddressT.setVisible(true);
        updateAddressT.setLocation(inputX, inputY + 2*distanceY);
        updateAddressT.setSize(inputSizeX, inputSizeY);
        updateAddressT.setText("");
        updateAddressT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateCourseT.setColumns(columns);
        updateCourseT.setVisible(true);
        updateCourseT.setLocation(inputX + distanceX, inputY + 2*distanceY);
        updateCourseT.setSize(inputSizeX, inputSizeY);
        updateCourseT.setText("");
        updateCourseT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //UPDATE COURSE
        updateCourseName.setLocation(inputX, inputLabelY + distanceY);
        updateCourseName.setText("Course Name");
        updateCourseName.setSize(200, 150);
        updateCourseName.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateCourseRoom.setVisible(true);
        updateCourseRoom.setLocation(inputX + distanceX, inputLabelY + distanceY);
        updateCourseRoom.setText("Room Number");
        updateCourseRoom.setSize(200, 150);
        updateCourseRoom.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateCourseTeacher.setVisible(true);
        updateCourseTeacher.setLocation(inputX + 2*(distanceX), inputLabelY + distanceY);
        updateCourseTeacher.setText("Teacher");
        updateCourseTeacher.setSize(200, 150);
        updateCourseTeacher.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateNameC.setColumns(columns);
        updateNameC.setVisible(true);
        updateNameC.setLocation(inputX, inputY + distanceY);
        updateNameC.setSize(inputSizeX, inputSizeY);
        updateNameC.setText("");
        updateNameC.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateRoomC.setColumns(columns);
        updateRoomC.setVisible(true);
        updateRoomC.setLocation(inputX + distanceX, inputY + distanceY);
        updateRoomC.setSize(inputSizeX, inputSizeY);
        updateRoomC.setText("");
        updateRoomC.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateTeacherC.setColumns(columns);
        updateTeacherC.setVisible(true);
        updateTeacherC.setLocation(inputX + 2*distanceX, inputY + distanceY);
        updateTeacherC.setSize(inputSizeX, inputSizeY);
        updateTeacherC.setText("");
        updateTeacherC.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //Panel 1
        b1.addActionListener(this);
        b1.setSize(buttonSizeX, buttonSizeY);
        b1.setVisible(true);
        b1.setText("Student Table");
        b1.setLocation(200, buttonY);
        
        b2.addActionListener(this);
        b2.setSize(buttonSizeX, buttonSizeY);
        b2.setVisible(true);
        b2.setText("Teacher Table");
        b2.setLocation(400, buttonY);
        
        b3.addActionListener(this);
        b3.setSize(buttonSizeX, buttonSizeY);
        b3.setVisible(true);
        b3.setText("Course Table");
        b3.setLocation(600, buttonY);
        //Panel 1a
        b1a.addActionListener(this);
        b1a.setSize(buttonSizeX, buttonSizeY);
        b1a.setVisible(true);
        b1a.setText("Add New Student");
        b1a.setLocation(300, buttonY);
        
        b1b.addActionListener(this);
        b1b.setSize(buttonSizeX, buttonSizeY);
        b1b.setVisible(true);
        b1b.setText("Update");
        b1b.setLocation(500, buttonY);
        
        //panel 1b
        b2a.addActionListener(this);
        b2a.setSize(buttonSizeX, buttonSizeY);
        b2a.setVisible(true);
        b2a.setText("Add New Teacher");
        b2a.setLocation(300, buttonY);
        
        b2b.addActionListener(this);
        b2b.setSize(buttonSizeX, buttonSizeY);
        b2b.setVisible(true);
        b2b.setText("Update");
        b2b.setLocation(500, buttonY);
        
        //panel 1c
        b3a.addActionListener(this);
        b3a.setSize(buttonSizeX, buttonSizeY);
        b3a.setVisible(true);
        b3a.setText("Add Course");
        b3a.setLocation(300, buttonY);
        
        b3b.addActionListener(this);
        b3b.setSize(buttonSizeX, buttonSizeY);
        b3b.setVisible(true);
        b3b.setText("Update");
        b3b.setLocation(500, buttonY);
        //submit
        submitStudentAdd.addActionListener(this);
        submitStudentAdd.setSize(buttonSizeX, buttonSizeY);
        submitStudentAdd.setVisible(true);
        submitStudentAdd.setText("Submit");
        submitStudentAdd.setLocation(submitButtonX, submitButtonY);
        
        submitStudentUpdate.addActionListener(this);
        submitStudentUpdate.setSize(buttonSizeX, buttonSizeY);
        submitStudentUpdate.setVisible(true);
        submitStudentUpdate.setText("Submit");
        submitStudentUpdate.setLocation(submitButtonX, submitButtonY);
  
        submitTeacherAdd.addActionListener(this);
        submitTeacherAdd.setSize(buttonSizeX, buttonSizeY);
        submitTeacherAdd.setVisible(true);
        submitTeacherAdd.setText("Submit");
        submitTeacherAdd.setLocation(submitButtonX, submitButtonY);
        
        submitTeacherUpdate.addActionListener(this);
        submitTeacherUpdate.setSize(buttonSizeX, buttonSizeY);
        submitTeacherUpdate.setVisible(true);
        submitTeacherUpdate.setText("Submit");
        submitTeacherUpdate.setLocation(submitButtonX, submitButtonY);
        
        submitCourseAdd.addActionListener(this);
        submitCourseAdd.setSize(buttonSizeX, buttonSizeY);
        submitCourseAdd.setVisible(true);
        submitCourseAdd.setText("Submit");
        submitCourseAdd.setLocation(submitButtonX, submitButtonY);
        
        submitCourseUpdate.addActionListener(this);
        submitCourseUpdate.setSize(buttonSizeX, buttonSizeY);
        submitCourseUpdate.setVisible(true);
        submitCourseUpdate.setText("Submit");
        submitCourseUpdate.setLocation(submitButtonX, submitButtonY);
        //clear
        clearAll1.addActionListener(this);
        clearAll1.setSize(buttonSizeX, buttonSizeY);
        clearAll1.setVisible(true);
        clearAll1.setText("Clear");
        clearAll1.setLocation(clearButtonX, clearButtonY);
        
        clearAll2.addActionListener(this);
        clearAll2.setSize(buttonSizeX, buttonSizeY);
        clearAll2.setVisible(true);
        clearAll2.setText("Clear");
        clearAll2.setLocation(clearButtonX, clearButtonY);
        
        clearAll3.addActionListener(this);
        clearAll3.setSize(buttonSizeX, buttonSizeY);
        clearAll3.setVisible(true);
        clearAll3.setText("Clear");
        clearAll3.setLocation(clearButtonX, clearButtonY);
        
        updateStudentButton.addActionListener(this);
        updateStudentButton.setSize(buttonSizeX, buttonSizeY);
        updateStudentButton.setVisible(true);
        updateStudentButton.setText("Update");
        updateStudentButton.setLocation(submitButtonX, submitButtonY);
        
        updateTeacherButton.addActionListener(this);
        updateTeacherButton.setSize(buttonSizeX, buttonSizeY);
        updateTeacherButton.setVisible(true);
        updateTeacherButton.setText("Update");
        updateTeacherButton.setLocation(submitButtonX, submitButtonY);
        
        updateCourseButton.addActionListener(this);
        updateCourseButton.setSize(buttonSizeX, buttonSizeY);
        updateCourseButton.setVisible(true);
        updateCourseButton.setText("Update");
        updateCourseButton.setLocation(submitButtonX, submitButtonY);
        //FIRST PANEL
        frame1.add(b1);
        frame1.add(b2);
        frame1.add(b3);
        frame1.setTitle("Student Registration System");
        frame1.setSize(frameSizeX, frameSizeY);
        frame1.setLocation(frameX, frameY);
        frame1.setResizable(false);
        frame1.add(x);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        //STUDENT
        frame2a.add(b1a);
        frame2a.add(b1b);
        frame2a.setTitle("Student Information");
        frame2a.setSize(frameSizeX, frameSizeY);
        frame2a.setLocation(frameX + distanceFrame, frameY + distanceFrame);
        frame2a.setResizable(false);
        frame2a.add(x);
        frame2a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2a.setVisible(false);
        
        frame2a1.add(studentID);
        frame2a1.add(first);
        frame2a1.add(last);
        frame2a1.add(birthdate);
        frame2a1.add(phoneNum);
        frame2a1.add(email);
        frame2a1.add(gender);
        frame2a1.add(address);
        frame2a1.add(school);
        frame2a1.add(studentLabel);
        frame2a1.add(firstName);
        frame2a1.add(lastName);
        frame2a1.add(birthday);
        frame2a1.add(phoneNumber);
        frame2a1.add(studentEmail);
        frame2a1.add(studentGender);
        frame2a1.add(studentAddress);
        frame2a1.add(studentSchool);
        frame2a1.add(submitStudentAdd);
        frame2a1.add(clearAll1);
        frame2a1.setTitle("Add Student");
        frame2a1.setSize(frameSizeX, frameSizeY);
        frame2a1.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        frame2a1.setResizable(false);
        frame2a1.add(x);
        frame2a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2a1.setVisible(false);
        
        frame2a2.add(updateStudentID);
        frame2a2.add(studentUpdateLabel);
        frame2a2.add(submitStudentUpdate);
        frame2a2.setTitle("Update");
        frame2a2.setSize(frameSizeX, frameSizeY);
        frame2a2.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        frame2a2.setResizable(false);
        frame2a2.add(x);
        frame2a2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2a2.setVisible(false);
        //TEACHER
        frame2b.add(b2a);
        frame2b.add(b2b);
        frame2b.setTitle("Teacher Information");
        frame2b.setSize(frameSizeX, frameSizeY);
        frame2b.setLocation(frameX + distanceFrame, frameY + distanceFrame);
        frame2b.setResizable(false);
        frame2b.add(x);
        frame2b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2b.setVisible(false);
       
        frame2b1.add(submitTeacherAdd);
        frame2b1.add(clearAll2);
        frame2b1.add(teacherLabel);
        frame2b1.add(firstNameT);
        frame2b1.add(lastNameT);
        frame2b1.add(birthdayT);
        frame2b1.add(phoneNumberT);
        frame2b1.add(teacherEmail);
        frame2b1.add(teacherGender);
        frame2b1.add(teacherCourse);
        frame2b1.add(teacherAddress);
        frame2b1.add(firstT);
        frame2b1.add(lastT);
        frame2b1.add(birthdateT);
        frame2b1.add(addressT);
        frame2b1.add(phoneNumT);
        frame2b1.add(emailT);
        frame2b1.add(genderT);
        frame2b1.add(courseT);
        frame2b1.setTitle("Add New Teacher");
        frame2b1.setSize(frameSizeX, frameSizeY);
        frame2b1.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        frame2b1.setResizable(false);
        frame2b1.add(x);
        frame2b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2b1.setVisible(false);
        
        frame2b2.add(updateTeacher);
        frame2b2.add(submitTeacherUpdate);
        frame2b2.add(teacherUpdateLabel);
        frame2b2.setTitle("Update");
        frame2b2.setSize(frameSizeX, frameSizeY);
        frame2b2.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        frame2b2.setResizable(false);
        frame2b2.add(x);
        frame2b2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2b2.setVisible(false);
        //COURSE
        frame2c.add(b3a);
        frame2c.add(b3b);
        frame2c.setTitle("Course Information");
        frame2c.setSize(frameSizeX, frameSizeY);
        frame2c.setLocation(frameX + distanceFrame, frameY + distanceFrame);
        frame2c.setResizable(false);
        frame2c.add(x);
        frame2c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2c.setVisible(false);
        
        frame2c1.add(submitCourseAdd);
        frame2c1.add(clearAll3);
        frame2c1.add(courseLabel);
        frame2c1.add(courseName);
        frame2c1.add(courseRoom);
        frame2c1.add(courseTeacher);
        frame2c1.add(course);
        frame2c1.add(teacher);
        frame2c1.add(room);
        frame2c1.setTitle("Add New Course");
        frame2c1.setSize(frameSizeX, frameSizeY);
        frame2c1.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        frame2c1.setResizable(false);
        frame2c1.add(x);
        frame2c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2c1.setVisible(false);
        
        frame2c2.add(submitCourseUpdate);
        frame2c2.add(courseUpdateLabel);
        frame2c2.add(updateCourse);
        frame2c2.setTitle("Update");
        frame2c2.setSize(frameSizeX, frameSizeY);
        frame2c2.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        frame2c2.setResizable(false);
        frame2c2.add(x);
        frame2c2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2c2.setVisible(false);
        //update student
        updateInfoStudent.add(updateFName);
        updateInfoStudent.add(updateLName);
        updateInfoStudent.add(updateBirthdate);
        updateInfoStudent.add(updatePhoneNum);
        updateInfoStudent.add(updateEmail);
        updateInfoStudent.add(updateGender);
        updateInfoStudent.add(updateAddress);
        updateInfoStudent.add(updateSchool);
        updateInfoStudent.add(updateStudentLabel);
        updateInfoStudent.add(updateFirstName);
        updateInfoStudent.add(updateLastName);
        updateInfoStudent.add(updateBirthday);
        updateInfoStudent.add(updatePhoneNumber);
        updateInfoStudent.add(updateStudentEmail);
        updateInfoStudent.add(updateStudentGender);
        updateInfoStudent.add(updateStudentAddress);
        updateInfoStudent.add(updateStudentSchool);
        updateInfoStudent.add(updateStudentButton);
        updateInfoStudent.setTitle("Updating Student");
        updateInfoStudent.setSize(frameSizeX, frameSizeY);
        updateInfoStudent.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        updateInfoStudent.setResizable(false);
        updateInfoStudent.add(x);
        updateInfoStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateInfoStudent.setVisible(false);
        
        updateInfoTeacher.add(updateFNameT);
        updateInfoTeacher.add(updateLNameT);
        updateInfoTeacher.add(updateBirthdateT);
        updateInfoTeacher.add(updatePhoneNumT);
        updateInfoTeacher.add(updateEmailT);
        updateInfoTeacher.add(updateGenderT);
        updateInfoTeacher.add(updateAddressT);
        updateInfoTeacher.add(updateCourseT);
        updateInfoTeacher.add(updateTeacherLabel);
        updateInfoTeacher.add(updateFirstNameT);
        updateInfoTeacher.add(updateLastNameT);
        updateInfoTeacher.add(updateBirthdayT);
        updateInfoTeacher.add(updatePhoneNumberT);
        updateInfoTeacher.add(updateTeacherEmail);
        updateInfoTeacher.add(updateTeacherGender);
        updateInfoTeacher.add(updateTeacherAddress);
        updateInfoTeacher.add(updateTeacherCourse);
        updateInfoTeacher.add(updateTeacherButton);
        updateInfoTeacher.setTitle("Updating Teacher");
        updateInfoTeacher.setSize(frameSizeX, frameSizeY);
        updateInfoTeacher.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        updateInfoTeacher.setResizable(false);
        updateInfoTeacher.add(x);
        updateInfoTeacher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateInfoTeacher.setVisible(false);
        
        updateInfoCourse.add(updateCourseButton);
        updateInfoCourse.add(updateCourseLabel);
        updateInfoCourse.add(updateCourseName);
        updateInfoCourse.add(updateCourseRoom); 
        updateInfoCourse.add(updateCourseTeacher);
        updateInfoCourse.add(updateNameC);
        updateInfoCourse.add(updateRoomC);
        updateInfoCourse.add(updateTeacherC);
        updateInfoCourse.setTitle("Updating Course");
        updateInfoCourse.setSize(frameSizeX, frameSizeY);
        updateInfoCourse.setLocation(frameX + 2*(distanceFrame), frameY + 2*(distanceFrame));
        updateInfoCourse.setResizable(false);
        updateInfoCourse.add(x);
        updateInfoCourse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateInfoCourse.setVisible(false);
    }
    public static void main(String args[])
    {
        new Database();
    }
    public void actionPerformed(ActionEvent evt)
    {
        Object src = evt.getSource();
        if(src == b1)
        {
            frame2a.setVisible(true);
        }
        if(src == b2)
        {
            frame2b.setVisible(true);
        }
        if(src == b3)
        {
            frame2c.setVisible(true);
        }
        if(src == b1a)
        {
            frame2a1.setVisible(true);
        }
        if(src == b1b)
        {
            frame2a2.setVisible(true);
        }
        if(src == b2a)
        {
            frame2b1.setVisible(true);
        }
        if(src == b2b)
        {
            frame2b2.setVisible(true);
        }
        if(src == b3a)
        {
            frame2c1.setVisible(true);
        }
        if(src == b3b)
        {
            frame2c2.setVisible(true);
        }
        if(src == clearAll1)
        {
            first.setText("");
            last.setText("");
            birthdate.setText("");
            phoneNum.setText("");
            email.setText("");
            gender.setText("");
            address.setText("");
            school.setText("");
        }
        if(src == clearAll2)
        {
            firstT.setText("");
            lastT.setText("");
            birthdateT.setText("");
            phoneNumT.setText("");
            emailT.setText("");
            genderT.setText("");
            addressT.setText("");
            courseT.setText("");
        }
        if(src == clearAll3)
        {
            courseName.setText("");
            courseRoom.setText("");
            courseTeacher.setText("");
        }
        if(src == submitStudentAdd)
        {
            insert1();
        }
        if(src == submitTeacherAdd)
        {
            insert2();
        }
        if(src == submitCourseAdd)
        {
            insert3();
        }
        if(src == submitStudentUpdate)
        {
            showStudent();
            updateInfoStudent.setVisible(true);
        }
        if(src == submitTeacherUpdate)
        {
            showTeacher();
            updateInfoTeacher.setVisible(true);
        }
        if(src == submitCourseUpdate)
        {
            showCourse();
            updateInfoCourse.setVisible(true);
        }
        if(src == updateStudentButton)
        {
            updateStudent();   
            JOptionPane.showMessageDialog(null, "Your Data Has been Updated");                    
        }
        if(src == updateTeacherButton)
        {
            updateTeacher();   
            JOptionPane.showMessageDialog(null, "Your Data Has been Updated");                    
        }
        if(src == updateCourseButton)
        {
            updateCourse();   
            JOptionPane.showMessageDialog(null, "Your Data Has been Updated");                    
        }
    }
    public void showStudent()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            System.out.println("Start of Try");
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            //PreparedStatement ps = conn.prepareStatement();
            System.out.println("After Prepared Statement");
            inputStudentID = updateStudentID.getText();
            System.out.println("ID that was typed in = " + inputStudentID); 
            
            String sql2 = "select fname, lname, birthdate, phone#, email, sex, address, school from student where student_ID = ?";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps2.setString(1, inputStudentID);
            System.out.println("After query");
            ResultSet rs = ps2.executeQuery();
            System.out.println("Before Loop");
            while(rs.next())
            {
                String updateFirstStudent = rs.getString("fname");
                updateFName.setText(updateFirstStudent);
                System.out.println("first name = " + rs.getString("fname"));
                
                String updateLastStudent = rs.getString("lname");
                updateLName.setText(updateLastStudent);
                System.out.println("last name = " + rs.getString("lname"));
                
                String updateBirthdateStudent = rs.getString("birthdate");
                updateBirthdate.setText(updateBirthdateStudent);
                System.out.println("birthdate = " + rs.getString("birthdate"));
                
                String updatePhoneStudent = rs.getString("phone#");
                updatePhoneNum.setText(updatePhoneStudent);
                System.out.println("phone# = " + rs.getString("phone#"));
                
                String updateEmailStudent = rs.getString("email");
                updateEmail.setText(updateEmailStudent);
                System.out.println("email = " + rs.getString("email"));
                
                String updateSexStudent = rs.getString("sex");
                updateGender.setText(updateSexStudent);
                System.out.println("sex = " + rs.getString("sex"));
                
                String updateAddressStudent = rs.getString("address");
                updateAddress.setText(updateAddressStudent);
                System.out.println("address = " + rs.getString("address"));
                
                String updateSchoolStudent = rs.getString("sex");
                updateSchool.setText(updateSchoolStudent);
                System.out.println("school = " + rs.getString("school"));
            }
            System.out.println("After Inserting into table");
            
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateStudent()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            System.out.println("Start of Try");
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            //PreparedStatement ps = conn.prepareStatement();
            System.out.println("After Prepared Statement");
            inputStudentID = updateStudentID.getText();
            System.out.println("update spot, ID = " + inputStudentID); 
            
            String sql2 = "update student set fname = ?, lname = ?, birthdate = ?, phone# = ?, email = ?, sex = ?, address = ?, school = ? where student_ID = ?";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            System.out.println("After query");
            
            ps2.setString(1, updateFName.getText());
            ps2.setString(2, updateLName.getText());
            ps2.setString(3, updateBirthdate.getText());
            ps2.setString(4, updatePhoneNum.getText());
            ps2.setString(5, updateEmail.getText());
            ps2.setString(6, updateGender.getText());
            ps2.setString(7, updateAddress.getText());
            ps2.setString(8, updateSchool.getText());
            ps2.setString(9, inputStudentID);
            System.out.println("After setString");
            ps2.executeUpdate();     
            System.out.println("After Inserting into table");
                    
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void showTeacher()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            System.out.println("Start of Try");
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            //PreparedStatement ps = conn.prepareStatement();
            System.out.println("After Prepared Statement");
            inputTeacherID = updateTeacher.getText();
            System.out.println("ID that was typed in = " + inputTeacherID); 
            
            String sql2 = "select teacher_ID, fname, lname, sex, phone, email, birthdate, course, address from teacher where teacher_ID = ?";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps2.setString(1, inputTeacherID);
            System.out.println("After query");
            ResultSet rs = ps2.executeQuery();
            System.out.println("Before Loop");
            while(rs.next())
            {
                String updateFirstTeacher = rs.getString("fname");
                updateFNameT.setText(updateFirstTeacher);
                System.out.println("first name = " + rs.getString("fname"));
                
                String updateLastTeacher = rs.getString("lname");
                updateLNameT.setText(updateLastTeacher);
                System.out.println("last name = " + rs.getString("lname"));
                
                String updateBirthdateTeacher = rs.getString("birthdate");
                updateBirthdateT.setText(updateBirthdateTeacher);
                System.out.println("birthdate = " + rs.getString("birthdate"));
                
                String updatePhoneTeacher = rs.getString("phone");
                updatePhoneNumT.setText(updatePhoneTeacher);
                System.out.println("phone# = " + rs.getString("phone"));
                
                String updateEmailTeacher = rs.getString("email");
                updateEmailT.setText(updateEmailTeacher);
                System.out.println("email = " + rs.getString("email"));
                
                String updateSexTeacher = rs.getString("sex");
                updateGenderT.setText(updateSexTeacher);
                System.out.println("sex = " + rs.getString("sex"));
                
                String updateAddressTeacher = rs.getString("address");
                updateAddressT.setText(updateAddressTeacher);
                System.out.println("address = " + rs.getString("address"));
                
                String updateCourseTeacher = rs.getString("sex");
                updateCourseT.setText(updateCourseTeacher);
                System.out.println("course = " + rs.getString("course"));
            }
            System.out.println("After Inserting into table");
            
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void updateTeacher()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            System.out.println("Start of Try");
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            //PreparedStatement ps = conn.prepareStatement();
            System.out.println("After Prepared Statement");
            inputTeacherID = updateTeacher.getText();
            System.out.println("update spot, ID = " + inputTeacherID); 
            
            String sql2 = "update teacher set fname = ?, lname = ?, sex = ?, phone = ?, email = ?, birthdate = ?, course = ?, address = ? where teacher_ID = ?";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            System.out.println("After query");
            
            ps2.setString(1, updateFNameT.getText());
            ps2.setString(2, updateLNameT.getText());
            ps2.setString(3, updateGenderT.getText());
            ps2.setString(4, updatePhoneNumT.getText());
            ps2.setString(5, updateEmailT.getText());
            ps2.setString(6, updateBirthdateT.getText());
            ps2.setString(7, updateCourseT.getText());
            ps2.setString(8, updateAddressT.getText());
            ps2.setString(9, inputTeacherID);
            System.out.println("After setString");
            ps2.executeUpdate();     
            System.out.println("After Inserting into table");
                    
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void showCourse()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            System.out.println("Start of Try");
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            //PreparedStatement ps = conn.prepareStatement();
            System.out.println("After Prepared Statement");
            inputCourseID = updateCourse.getText();
            System.out.println("ID that was typed in = " + inputCourseID); 
            
            String sql2 = "select name, room, teacher from course where course_ID = ?";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps2.setString(1, inputCourseID);
            System.out.println("After query");
            ResultSet rs = ps2.executeQuery();
            System.out.println("Before Loop");
            while(rs.next())
            {
                String updateNameCourse = rs.getString("name");
                updateNameC.setText(updateNameCourse);
                System.out.println("name = " + rs.getString("name"));
                
                String updateRoomCourse = rs.getString("room");
                updateRoomC.setText(updateRoomCourse);
                System.out.println("Room = " + rs.getString("room"));
                
                String updateTeacherCourse = rs.getString("teacher");
                updateTeacherC.setText(updateTeacherCourse);
                System.out.println("teacher = " + rs.getString("teacher"));
                
            }
            System.out.println("After Inserting into table");
            
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
     public void updateCourse()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            System.out.println("Start of Try");
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            //PreparedStatement ps = conn.prepareStatement();
            System.out.println("After Prepared Statement");
            inputCourseID = updateCourse.getText();
            System.out.println("update spot, ID = " + inputCourseID); 
            
            String sql2 = "update course set name = ?, room = ?, teacher = ? where course_ID = ?";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            System.out.println("After query");
            
            ps2.setString(1, updateNameC.getText());
            ps2.setString(2, updateRoomC.getText());
            ps2.setString(3, updateTeacherC.getText());
            ps2.setString(4, inputCourseID);
            System.out.println("After setString");
            ps2.executeUpdate();     
            System.out.println("After Inserting into table");
                    
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void insert1()
    {   
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            student_seq = "select student_sequence.nextval from dual";
            PreparedStatement ps = conn.prepareStatement(student_seq);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {   
                intStudentID = rs.getInt(1);
            }
            String sql2 = "insert into student(student_ID, fname, lname, birthdate, phone#, email, sex, address, school) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            System.out.println("After inserting into seq_example, value of nextID is " + intStudentID);
            strStudentID = Integer.toString(intStudentID);
            ps2.setString(1, strStudentID); 
            System.out.println("After setInt");
            ps2.setString(2, first.getText());
            System.out.println("first name = " + first);
            ps2.setString(3, last.getText());
            System.out.println("last name = " + last);
            ps2.setString(4, birthdate.getText());
            System.out.println("birthdate = " + birthdate);
            ps2.setString(5, phoneNum.getText());
            System.out.println("phoneNum = " + phoneNum);
            ps2.setString(6, email.getText());
            System.out.println("email = " + email);
            ps2.setString(7, gender.getText());
            System.out.println("gender = "+ gender);
            ps2.setString(8, address.getText());
            System.out.println("address = " + address);
            ps2.setString(9, school.getText());
            System.out.println("school = " + school);
            System.out.println("After setString");
            ps2.executeUpdate();     
            System.out.println("After Inserting into table");
                    
          
            JOptionPane.showConfirmDialog(null, "Your Data Has been Inserted",
                    "Result", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
    
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void insert2()
    {   
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            teacher_seq = "select teacher_seq.nextval from dual";
            PreparedStatement ps = conn.prepareStatement(teacher_seq);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {   
                intTeacherID = rs.getInt(1);
            }
            String sql2 = "insert into teacher(teacher_ID, fname, lname, sex, phone, email, birthdate, course, address) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            System.out.println("After inserting into seq_example, value of nextID is " + intTeacherID);
            strTeacherID = Integer.toString(intTeacherID);
            ps2.setString(1, strTeacherID); 
            System.out.println("After setInt");
            ps2.setString(2, firstT.getText());
            System.out.println("first name = " + firstT);
            ps2.setString(3, lastT.getText());
            System.out.println("last name = " + lastT);
            ps2.setString(4, genderT.getText());
            System.out.println("gender = " + genderT);
            ps2.setString(5, phoneNumT.getText());
            System.out.println("phoneNum = " + phoneNumT);
            ps2.setString(6, emailT.getText());
            System.out.println("email = " + emailT);
            ps2.setString(7, birthdateT.getText());
            System.out.println("birthdate = "+ birthdateT);
            ps2.setString(8, courseT.getText());
            System.out.println("course = " + courseT);
            ps2.setString(9, addressT.getText());
            System.out.println("address = " + addressT);
            System.out.println("After setString");
            ps2.executeUpdate();     
            System.out.println("After Inserting into table");
                    
          
            JOptionPane.showConfirmDialog(null, "Your Data Has been Inserted",
                    "Result", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
    
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void insert3()
    {   
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        try 
        {
            Connection conn = DriverManager.getConnection(database, username, password);
            Statement st = conn.createStatement();
            course_seq = "select course_seq.nextval from dual";
            PreparedStatement ps = conn.prepareStatement(course_seq);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {   
                intCourseID = rs.getInt(1);
            }
            String sql2 = "insert into course(course_ID, name, room, teacher) values(?, ?, ?, ?)";
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            System.out.println("After inserting into seq_example, value of nextID is " + intCourseID);
            strCourseID = Integer.toString(intCourseID);
            ps2.setString(1, strCourseID); 
            System.out.println("After setInt");
            ps2.setString(2, courseName.getText());
            System.out.println("Name = " + course);
            ps2.setString(3, courseRoom.getText());
            System.out.println("room = " + room);
            ps2.setString(4, courseTeacher.getText());
            System.out.println("teacher = " + teacher);
            System.out.println("After setString");
            ps2.executeUpdate();     
            System.out.println("After Inserting into table");
                    
          
            JOptionPane.showConfirmDialog(null, "Your Data Has been Inserted",
                    "Result", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
    
            st.close();
            conn.close();
            if (conn != null) 
            {
                System.out.println("Connected to the database!");
            }
            else 
            {
                System.out.println("Failed to make connection!");
            }
            
        } 
        catch (SQLException e) 
        {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}



