import javax.swing.*;  
public class SwingExampleList  { 
public static void main(String args[])  { 
   JFrame frame= new JFrame();  
        DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("fita");
          l1.addElement("sari");  
          l1.addElement("ia");  
          l1.addElement("cendol");  
          JList<String> list = new JList<>(l1);  
          list.setBounds(0,0, 100,100);  
          frame.add(list);  
          frame.setSize(400,400);  
          frame.setLayout(null);  
          frame.setVisible(true); 
         }
      }  