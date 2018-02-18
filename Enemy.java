/**
 * Enemy.java
 * @author Yusuf A. Taha
 * @see Game.java
 * The enemy object
 * class 👾
 */

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public final class  Enemy
{
	// Enemy object feilds
    private int x;
    private int y;
    private int speed;
    private int type;
    private Image enemyImg;
	// used for second enemy movement
	private  boolean hitEdge = false;
	// used for third enemy movement
	private int spaceTime = 0;
	private int timeIsHoax = 0;

	/**
	 * CONSTRUCTOR
	 */
    public Enemy(final int x, final int y,
                 final int speed, final int type)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.type = type;
        enemyImg = new ImageIcon(String.format("Images/enemy%d.png", type)).getImage();
    }

    ///////////////////////
	// SETTERS & GETTERS //
    ///////////////////////

	/**
	 * @return the enemy's y coordinate
	 */
	public int getY() {return y;}

	/**
	 * @param val the y to set
	 */
	public void setY(final int val) {this.y = val;}

	/**
	 * @return the enemy's x to get
	 */
	public int getX() {return x;}

	/**
	 * @param val the x to set
	 */
	public void setX(final int val) {this.x = val;}

	/**
	 * @return the enemy's moving speed
	 */
	public int getSpeed() {return speed;}

	/**
	 * @param speed the enemy's moving speed to set
	 */
	public void setSpeed(final int speed) {this.speed = speed;}

	/**
	 * @return the type
	 */
	public int getType() {return type;}

	/**
	 * @param type the type to set
	 */
	public void setType(final int type) {this.type = type;}

	/**
	 * @return the hitEdge
	 */
	public boolean isHitEdge() {return hitEdge;}

	/**
	 * @param hitEdge the hitEdge to set
	 */
	public void setHitEdge(boolean hitEdge) {this.hitEdge = hitEdge;}

	/**
	 * @return the spaceTime
	 */
	public int getSpaceTime() {return spaceTime;}

	/**
	 * @param spaceTime the spaceTime to set
	 */
	public void setSpaceTime(int spaceTime) {this.spaceTime = spaceTime;}

	/**
	 * @return the timeIsHoax
	 */
	public int getTimeIsHoax() {return timeIsHoax;}

	/**
	 * @param timeIsHoax the timeIsHoax to set
	 */
	public void setTimeIsHoax(int timeIsHoax) {this.timeIsHoax = timeIsHoax;}

    //////////////////////
    //  OTHER FUNCTIONS //
    //////////////////////

    /** draws the enemy onto the graphic component
     * @param g the graphics component the function
     * is drawing to
     */
    public void draw(final Graphics g) {g.drawImage(enemyImg, x, y, null);}
}