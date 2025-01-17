// test commit


import java.util.ArrayList;

/**
 * The Box class models a three-dimensional box
 */
public class Box implements Comparable<Box> {
    private final int height;
    private final int width;
    private final int depth;



    /**
     * Create a new Box with the specified dimensions (height, width, depth).
     *
     * @param height the height of the box
     * @param width the width of the box
     * @param depth the depth of the box
     */
    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    /**
     * Create a copy of box.
     *
     * @param box A Box to copy.
     */
    public Box(Box box) {
        this.height = box.height;
        this.width = box.width;
        this.depth = box.depth;
    }

    /**
     * Get this box's volume
     *
     * @return the box's volume
     */
    public int volume() {
        return height * width * depth;
    }

    /**
     * @return The box's height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return The box's width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return The box's depth
     */
    public int getDepth() {
        return depth;
    }



    /**
     * Defines the hash code of this Box.
     *
     * This is required by the contract of hashCode, which states that if for
     * two objects x and y, x.equals(y) is true,
     * then x.hashCode() == y.hashCode() must also be true. So, as we override
     * the Object.equals(Object o), we must also override Object.hashCode().
     *
     * For a good explanation, see Effective Java Recipe Item 9
     * @return the hash code of this Box
     */
    @Override
    public int hashCode(){
        int result = 13;
        result = 31 * result + height;
        result = 31 * result + width;
        result = 31 * result + depth;
        return result;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Box)) {
            return false;
        }
        Box other = (Box) o;
        return this.volume() == other.volume();
    }

    //Answer to Exercise 1

    @Override
    public int compareTo(Box o) {
        Box other = (Box) o;
        return (this.volume()) - (other.volume());
    }
}
