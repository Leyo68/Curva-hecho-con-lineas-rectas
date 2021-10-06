
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * @author LEODEGARIO
 */
public class Lineas extends JFrame{
    static GL gl;
    static GLU glu;
    
    public Lineas(){
        setSize(500, 500);
        //Se coloca el marco en el centro
        setLocationRelativeTo(null);
        setTitle("Líneas");
        //Instanciamos la clase Graphic
        GraphicListener listener = new GraphicListener();
        //Creamos el canvas
        GLCanvas canvas = new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
    }

    public static void main (String args[]){
        //JFrame.setDefaultLookAndFeelDecorated(true);
        Lineas frame = new Lineas();
        frame.setVisible(true);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public class GraphicListener implements GLEventListener{
        //Entorno de trabajo
        public void init(GLAutoDrawable arg0) {
            glu = new GLU();
            gl = arg0.getGL();
            //Color de inicio
            //              R   G   B   A
            gl.glClearColor(1, 1, 0, 1);
            //Permite usar la pantalla
            gl.glMatrixMode(gl.GL_PROJECTION);
            //Dimensiones de la ventana con ayuda del plano cartesiano
            //             -x    x   -y   y
            glu.gluOrtho2D(-500, 500, -500, 500);   
        }
        
        public void display(GLAutoDrawable arg0) {
            
            gl.glColor3f(1,0,0);
            gl.glLineWidth(2);
                gl.glBegin(GL.GL_LINES);
                    //Eje y
                    gl.glVertex2f(-400, 400);
                    gl.glVertex2f(-400, -400);
                    //Eje x
                    gl.glVertex2f(-400, -400);
                    gl.glVertex2f(400, -400);
                    //
                    gl.glVertex2f(-400, 400);
                    gl.glVertex2f(-380, -400);
                    // -x   +y
                    gl.glVertex2f(-400, 380);
                    gl.glVertex2f(-360, -400);
                    //
                    gl.glVertex2f(-400, 360);
                    gl.glVertex2f(-340, -400);
                    //
                    gl.glVertex2f(-400, 340);
                    gl.glVertex2f(-320, -400);
                    //
                    gl.glVertex2f(-400, 320);
                    gl.glVertex2f(-300, -400);
                    //
                    gl.glVertex2f(-400, 300);
                    gl.glVertex2f(-280, -400);
                    //
                    gl.glVertex2f(-400, 280);
                    gl.glVertex2f(-260, -400);
                    //
                    gl.glVertex2f(-400, 260);
                    gl.glVertex2f(-240, -400);
                    //
                    gl.glVertex2f(-400, 240);
                    gl.glVertex2f(-220, -400);
                    //
                    gl.glVertex2f(-400, 220);
                    gl.glVertex2f(-200, -400);
                    //
                    gl.glVertex2f(-400, 200);
                    gl.glVertex2f(-180, -400);
                    //
                    gl.glVertex2f(-400, 180);
                    gl.glVertex2f(-160, -400);
                    //
                    gl.glVertex2f(-400, 160);
                    gl.glVertex2f(-140, -400);
                    //
                    gl.glVertex2f(-400, 140);
                    gl.glVertex2f(-120, -400);
                    //
                    gl.glVertex2f(-400, 120);
                    gl.glVertex2f(-100, -400);
                    //
                    gl.glVertex2f(-400, 100);
                    gl.glVertex2f(-80, -400);
                    //
                    gl.glVertex2f(-400, 80);
                    gl.glVertex2f(-60, -400);
                    //
                    gl.glVertex2f(-400, 60);
                    gl.glVertex2f(-40, -400);
                    //
                    gl.glVertex2f(-400, 40);
                    gl.glVertex2f(-20, -400);
                    //
                    gl.glVertex2f(-400, 20);
                    gl.glVertex2f(0, -400);
                    
                    // +x   -y
                    gl.glVertex2f(-400, 0);
                    gl.glVertex2f(20, -400);
                    //
                    gl.glVertex2f(-400, -20);
                    gl.glVertex2f(40, -400);
                    //
                    gl.glVertex2f(-400, -40);
                    gl.glVertex2f(60, -400);
                    //
                    gl.glVertex2f(-400, -60);
                    gl.glVertex2f(80, -400);
                    //
                    gl.glVertex2f(-400, -80);
                    gl.glVertex2f(100, -400);
                    //
                    gl.glVertex2f(-400, -100);
                    gl.glVertex2f(120, -400);
                    //
                    gl.glVertex2f(-400, -120);
                    gl.glVertex2f(140, -400);
                    //
                    gl.glVertex2f(-400, -140);
                    gl.glVertex2f(160, -400);
                    //
                    gl.glVertex2f(-400, -160);
                    gl.glVertex2f(180, -400);
                    //
                    gl.glVertex2f(-400, -180);
                    gl.glVertex2f(200, -400);
                    //
                    gl.glVertex2f(-400, -200);
                    gl.glVertex2f(220, -400);
                    //
                    gl.glVertex2f(-400, -220);
                    gl.glVertex2f(240, -400);
                    //
                    gl.glVertex2f(-400, -240);
                    gl.glVertex2f(260, -400);
                    //
                    gl.glVertex2f(-400, -260);
                    gl.glVertex2f(280, -400);
                    //
                    gl.glVertex2f(-400, -280);
                    gl.glVertex2f(300, -400);
                    //
                    gl.glVertex2f(-400, -300);
                    gl.glVertex2f(320, -400);
                    //
                    gl.glVertex2f(-400, -320);
                    gl.glVertex2f(340, -400);
                    //
                    gl.glVertex2f(-400, -340);
                    gl.glVertex2f(360, -400);
                    //
                    gl.glVertex2f(-400, -360);
                    gl.glVertex2f(380, -400);
                    //
                    gl.glVertex2f(-400, -380);
                    gl.glVertex2f(400, -400); 
                gl.glEnd();
                
                gl.glColor3f(0,0,0);
                gl.glPushMatrix();
                    //gl.glTranslated(0, 100, 0);
                    gl.glPointSize(3);
                    gl.glBegin(GL.GL_POINTS);
                        gl.glVertex2f(0, 0);
                    gl.glEnd();
                gl.glPopMatrix();
            gl.glFlush();
        }
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            
        }
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {

        }
    }
}
