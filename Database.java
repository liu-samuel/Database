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
    //buttons
    JButton b1 = new JButton("Student Table");
    JButton b2 = new JButton("Teacher Table");
    JButton b3 = new JButton("Course Table");
    JButton b1a = new JButton("Add New Student");
    JButton b1b = new JButton("Update");
    JButton b1c = new JButton("Search Student");
    JButton b2a = new JButton("Add New Teacher");
    JButton b2b = new JButton("Update");
    JButton b2c = new JButton("Search Teacher");
    JButton b3a = new JButton("Add Course Student");
    JButton b3b = new JButton("Update");
    JButton b3c = new JButton("Search Course");
    
    JButton submitStudentAdd = new JButton("Submit");
    JButton submitStudentUpdate = new JButton("Submit");
    JButton submitStudentSearch = new JButton("Submit");
    JButton clearAll1 = new JButton("Clear");
    
    JButton submitTeacherAdd = new JButton("Submit");
    JButton submitTeacherUpdate = new JButton("Submit");
    JButton submitTeacherSearch = new JButton("Submit");
    JButton clearAll2 = new JButton("Clear");
    
    JButton submitCourseAdd = new JButton("Submit");
    JButton submitCourseUpdate = new JButton("Submit");
    JButton submitCourseSearch = new JButton("Submit");
    JButton clearAll3 = new JButton("Clear");
    //frames
    JFrame frame1 = new JFrame();
    JFrame frame2a = new JFrame();
    JFrame frame2b = new JFrame();
    JFrame frame2c = new JFrame();
    JFrame frame2a1 = new JFrame();
    JFrame frame2a2 = new JFrame();
    JFrame frame2a3 = new JFrame();
    JFrame frame2b1 = new JFrame();
    JFrame frame2b2 = new JFrame();
    JFrame frame2b3 = new JFrame();
    JFrame frame2c1 = new JFrame();
    JFrame frame2c2 = new JFrame();
    JFrame frame2c3 = new JFrame();
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
    
    JTextField updateStudent = new JTextField("Student ID");
    JTextField searchStudent = new JTextField("Student ID");
    
    //teacher textfields
    JTextField firstT = new JTextField("First Name");
    JTextField lastT = new JTextField("First Name");
    JTextField birthdateT = new JTextField("First Name");
    JTextField addressT = new JTextField("First Name");
    JTextField phoneNumT = new JTextField("First Name");
    JTextField emailT = new JTextField("First Name");
    JTextField genderT = new JTextField("First Name");
    JTextField schoolT = new JTextField("First Name");
    
    JTextField updateTeacher = new JTextField("Teacher ID");
    JTextField searchTeacher = new JTextField("Teacher ID"); 
    
    //course textfields
    JTextField courseID = new JTextField("");
    JTextField courseName = new JTextField("");
    JTextField courseRoom = new JTextField("");
    JTextField courseTeacher = new JTextField("");
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
    JLabel studentSearchLabel = new JLabel();
    
    //labels for teachers
    JLabel teacherLabel = new JLabel("Add Student");
    JLabel firstNameT = new JLabel();
    JLabel lastNameT = new JLabel();
    JLabel birthdayT = new JLabel();
    JLabel phoneNumberT = new JLabel();
    JLabel teacherEmail = new JLabel();
    JLabel teacherGender = new JLabel();
    JLabel teacherAddress = new JLabel();
    JLabel teacherSchool = new JLabel();
    
    JLabel teacherUpdateLabel = new JLabel();
    JLabel teacherSearchLabel = new JLabel();
    
    //course labels
    JLabel ID = new JLabel("");
    JLabel course = new JLabel("");
    JLabel room = new JLabel("");
    JLabel teacher = new JLabel("");
    public Database()
    {        
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
        studentGender.setText("Gender");
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
        
        updateStudent.setColumns(columns);
        updateStudent.setVisible(true);
        updateStudent.setLocation(inputX + distanceX, inputY);
        updateStudent.setSize(inputSizeX, inputSizeY);
        updateStudent.setText("");
        updateStudent.setFont(new Font("Calibri", Font.PLAIN, font));
        
        searchStudent.setColumns(columns);
        searchStudent.setVisible(true);
        searchStudent.setLocation(inputX + distanceX, inputY);
        searchStudent.setSize(inputSizeX, inputSizeY);
        searchStudent.setText("");
        searchStudent.setFont(new Font("Calibri", Font.PLAIN, font));
        //update
        studentUpdateLabel.setVisible(true);
        studentUpdateLabel.setLocation(headerX, headerY);
        studentUpdateLabel.setText("Enter Student ID");
        studentUpdateLabel.setSize(200, 150);
        studentUpdateLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherUpdateLabel.setVisible(true);
        teacherUpdateLabel.setLocation(headerX, headerY);
        teacherUpdateLabel.setText("Enter Teacher ID");
        teacherUpdateLabel.setSize(200, 150);
        teacherUpdateLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        //search
        studentSearchLabel.setVisible(true);
        studentSearchLabel.setLocation(headerX, headerY);
        studentSearchLabel.setText("Enter Student ID");
        studentSearchLabel.setSize(200, 150);
        studentSearchLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherSearchLabel.setVisible(true);
        teacherSearchLabel.setLocation(headerX, headerY);
        teacherSearchLabel.setText("Enter Teacher ID");
        teacherSearchLabel.setSize(200, 150);
        teacherSearchLabel.setFont(new Font("Calibri", Font.PLAIN, font));
        
        
        //label teacher
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
        teacherGender.setText("Gender");
        teacherGender.setSize(200, 150);
        teacherGender.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherAddress.setVisible(true);
        teacherAddress.setLocation(inputX, inputLabelY + 2*(distanceY));
        teacherAddress.setText("Address");
        teacherAddress.setSize(200, 150);
        teacherAddress.setFont(new Font("Calibri", Font.PLAIN, font));
        
        teacherSchool.setVisible(true);
        teacherSchool.setLocation(inputX + distanceX, inputLabelY + 2*(distanceY));
        teacherSchool.setText("School");
        teacherSchool.setSize(200, 150);
        teacherSchool.setFont(new Font("Calibri", Font.PLAIN, font));
        
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
        phoneNumT.setLocation(inputX + distanceX, inputY + distanceY);
        phoneNumT.setText("");
        phoneNumT.setSize(inputSizeX, inputSizeY);
        phoneNumT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        emailT.setColumns(columns);
        emailT.setVisible(true);
        emailT.setLocation(inputX + 2*(distanceX), inputY + distanceY);
        emailT.setText("");
        emailT.setSize(inputSizeX, inputSizeY);
        emailT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        genderT.setColumns(columns);
        genderT.setVisible(true);
        genderT.setLocation(inputX, inputY + (distanceY));
        genderT.setText("");
        genderT.setSize(inputSizeX, inputSizeY);
        genderT.setFont(new Font("Calibri", Font.PLAIN, font));
              
        addressT.setColumns(columns);
        addressT.setVisible(true);
        addressT.setLocation(inputX, inputY + 2*(distanceY));
        addressT.setText("");
        addressT.setSize(inputSizeX, inputSizeY);
        addressT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        schoolT.setColumns(columns);
        schoolT.setVisible(true);
        schoolT.setLocation(inputX + distanceX, inputY + 2*(distanceY));
        schoolT.setText("");
        schoolT.setSize(inputSizeX, inputSizeY);
        schoolT.setFont(new Font("Calibri", Font.PLAIN, font));
        
        updateTeacher.setColumns(columns);
        updateTeacher.setVisible(true);
        updateTeacher.setLocation(inputX + distanceX, inputY);
        updateTeacher.setSize(inputSizeX, inputSizeY);
        updateTeacher.setText("");
        updateTeacher.setFont(new Font("Calibri", Font.PLAIN, font));
        
        searchTeacher.setColumns(columns);
        searchTeacher.setVisible(true);
        searchTeacher.setLocation(inputX + distanceX, inputY);
        searchTeacher.setSize(inputSizeX, inputSizeY);
        searchTeacher.setText("");
        searchTeacher.setFont(new Font("Calibri", Font.PLAIN, font));
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
        b1a.setLocation(200, buttonY);
        
        b1b.addActionListener(this);
        b1b.setSize(buttonSizeX, buttonSizeY);
        b1b.setVisible(true);
        b1b.setText("Update");
        b1b.setLocation(400, buttonY);
        
        b1c.addActionListener(this);
        b1c.setSize(buttonSizeX, buttonSizeY);
        b1c.setVisible(true);
        b1c.setText("Search Student");
        b1c.setLocation(600, buttonY);
        //panel 1b
        b2a.addActionListener(this);
        b2a.setSize(buttonSizeX, buttonSizeY);
        b2a.setVisible(true);
        b2a.setText("Add New Teacher");
        b2a.setLocation(200, buttonY);
        
        b2b.addActionListener(this);
        b2b.setSize(buttonSizeX, buttonSizeY);
        b2b.setVisible(true);
        b2b.setText("Update");
        b2b.setLocation(400, buttonY);
        
        b2c.addActionListener(this);
        b2c.setSize(buttonSizeX, buttonSizeY);
        b2c.setVisible(true);
        b2c.setText("Search Teacher");
        b2c.setLocation(600, buttonY);
        //panel 1c
        b3a.addActionListener(this);
        b3a.setSize(buttonSizeX, buttonSizeY);
        b3a.setVisible(true);
        b3a.setText("Add Course");
        b3a.setLocation(200, buttonY);
        
        b3b.addActionListener(this);
        b3b.setSize(buttonSizeX, buttonSizeY);
        b3b.setVisible(true);
        b3b.setText("Update");
        b3b.setLocation(400, buttonY);
        
        b3c.addActionListener(this);
        b3c.setSize(buttonSizeX, buttonSizeY);
        b3c.setVisible(true);
        b3c.setText("Search Course");
        b3c.setLocation(600, buttonY);
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
        
        submitStudentSearch.addActionListener(this);
        submitStudentSearch.setSize(buttonSizeX, buttonSizeY);
        submitStudentSearch.setVisible(true);
        submitStudentSearch.setText("Submit");
        submitStudentSearch.setLocation(submitButtonX, submitButtonY);
        
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
        
        submitTeacherSearch.addActionListener(this);
        submitTeacherSearch.setSize(buttonSizeX, buttonSizeY);
        submitTeacherSearch.setVisible(true);
        submitTeacherSearch.setText("Submit");
        submitTeacherSearch.setLocation(submitButtonX, submitButtonY);
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
        
        //FIRST PANEL
        frame1.add(b1);
        frame1.add(b2);
        frame1.add(b3);
        frame1.setTitle("School Database");
        frame1.setSize(frameSizeX, frameSizeY);
        frame1.setLocation(frameX, frameY);
        frame1.setResizable(false);
        frame1.add(x);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        //STUDENT
        frame2a.add(b1a);
        frame2a.add(b1b);
        frame2a.add(b1c);
        frame2a.setTitle("Student Table");
        frame2a.setSize(frameSizeX, frameSizeY);
        frame2a.setLocation(frameX, frameY);
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
        frame2a1.setLocation(frameX, frameY);
        frame2a1.setResizable(false);
        frame2a1.add(x);
        frame2a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2a1.setVisible(false);
        
        frame2a2.add(updateStudent);
        frame2a2.add(studentUpdateLabel);
        frame2a2.add(submitStudentUpdate);
        frame2a2.setTitle("Update");
        frame2a2.setSize(frameSizeX, frameSizeY);
        frame2a2.setLocation(frameX, frameY);
        frame2a2.setResizable(false);
        frame2a2.add(x);
        frame2a2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2a2.setVisible(false);
        
        frame2a3.add(studentSearchLabel);
        frame2a3.add(searchStudent);
        frame2a3.add(submitStudentSearch);
        frame2a3.setTitle("Search Student");
        frame2a3.setSize(frameSizeX, frameSizeY);
        frame2a3.setLocation(frameX, frameY);
        frame2a3.setResizable(false);
        frame2a3.add(x);
        frame2a3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2a3.setVisible(false);
        //TEACHER
        frame2b.add(b2a);
        frame2b.add(b2b);
        frame2b.add(b2c);
        frame2b.setTitle("Teacher Table");
        frame2b.setSize(frameSizeX, frameSizeY);
        frame2b.setLocation(frameX, frameY);
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
        frame2b1.add(teacherSchool);
        frame2b1.add(teacherAddress);
        frame2b1.add(firstT);
        frame2b1.add(lastT);
        frame2b1.add(birthdateT);
        frame2b1.add(addressT);
        frame2b1.add(phoneNumT);
        frame2b1.add(emailT);
        frame2b1.add(genderT);
        frame2b1.add(schoolT);
        frame2b1.setTitle("Add New Teacher");
        frame2b1.setSize(frameSizeX, frameSizeY);
        frame2b1.setLocation(frameX, frameY);
        frame2b1.setResizable(false);
        frame2b1.add(x);
        frame2b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2b1.setVisible(false);
        
        frame2b2.add(updateTeacher);
        frame2b2.add(submitTeacherUpdate);
        frame2b2.add(teacherUpdateLabel);
        frame2b2.setTitle("Update");
        frame2b2.setSize(frameSizeX, frameSizeY);
        frame2b2.setLocation(frameX, frameY);
        frame2b2.setResizable(false);
        frame2b2.add(x);
        frame2b2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2b2.setVisible(false);
        
        frame2b3.add(searchTeacher);
        frame2b3.add(teacherSearchLabel);
        frame2b3.add(submitTeacherSearch);
        frame2b3.setTitle("Search Teacher");
        frame2b3.setSize(frameSizeX, frameSizeY);
        frame2b3.setLocation(frameX, frameY);
        frame2b3.setResizable(false);
        frame2b3.add(x);
        frame2b3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2b3.setVisible(false);
        //COURSE
        frame2c.add(b3a);
        frame2c.add(b3b);
        frame2c.add(b3c);
        frame2c.setTitle("Course Table");
        frame2c.setSize(frameSizeX, frameSizeY);
        frame2c.setLocation(frameX, frameY);
        frame2c.setResizable(false);
        frame2c.add(x);
        frame2c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2c.setVisible(false);
        
        frame2c1.setTitle("Add New Course");
        frame2c1.setSize(frameSizeX, frameSizeY);
        frame2c1.setLocation(frameX, frameY);
        frame2c1.setResizable(false);
        frame2c1.add(x);
        frame2c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2c1.setVisible(false);
        
        frame2c2.setTitle("Update");
        frame2c2.setSize(frameSizeX, frameSizeY);
        frame2c2.setLocation(frameX, frameY);
        frame2c2.setResizable(false);
        frame2c2.add(x);
        frame2c2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2c2.setVisible(false);
        
        frame2c3.setTitle("Search Course");
        frame2c3.setSize(frameSizeX, frameSizeY);
        frame2c3.setLocation(frameX, frameY);
        frame2c3.setResizable(false);
        frame2c3.add(x);
        frame2c3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2c3.setVisible(false);
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
        if(src == b1c)
        {
            frame2a3.setVisible(true);
        }
        if(src == b2a)
        {
            frame2b1.setVisible(true);
        }
        if(src == b2b)
        {
            frame2b2.setVisible(true);
        }
        if(src == b2c)
        {
            frame2b3.setVisible(true);
        }
        if(src == b3a)
        {
            frame2c1.setVisible(true);
        }
        if(src == b3b)
        {
            frame2c2.setVisible(true);
        }
        if(src == b3c)
        {
            frame2c3.setVisible(true);
        }
        if(src == clearAll1)
        {
            first.setText("");
            last.setText("");
            birthdate.setText("");
            studentID.setText("");
            phoneNum.setText("");
            email.setText("");
            gender.setText("");
            address.setText("");
            school.setText("");
        }
        if(src == submitStudentAdd)
        {
            insert();
        }       
    }
    public void insert()
    {   
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }

        // Oracle SID = orcl , find yours in tnsname.ora
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:samDB", "sam", "12345"))
        {
            Statement st = conn.createStatement();
    
            st.executeUpdate("insert into student(student_id, fname, lname, birthdate, phone#, email, sex, address, school) VALUES('"
                    + 1 + first.getText() + "','" 
                    + last.getText() + "','" + birthdate.getText() + "','" 
                    + "','" + phoneNum.getText() + "','" + email.getText()
                    + "','" + gender.getText() + "','" + address.getText() 
                    + "','" + school.getText() + "')");
    
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



