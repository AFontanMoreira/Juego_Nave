package com.company;

import javax.swing.JFrame;
import java.awt.*;

public class Window  extends JFrame implements  Runnable {

public static final  int WIDTH = 800, HEIGHT =600;
private Canvas canvas;
private Thread thread;
    public Window(){
        setTitle("Space Ship Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);


        canvas = new Canvas();

        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(true);

        add(canvas);


    }


    public static void main(String[] args) {
        new Window();
    }

    new Window();

    @Override
    public void run() {

    stop();

    }
    private void  start(){

    thread =new Thread(this);
    thread.start();

    }
    private void  stop(){

        try {

            thread.join();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}
