package fr.jonybegood.breakingball.entities;

public class Ball {
    private float x, y; // Position de la balle
    private float dx, dy; // Vitesse de la balle
    private float radius; // Rayon de la balle

    private float offset = 0;

    private int speed, rebound;

    private boolean ball_stop;

    public void setX(float x) {
        this.x = x;
    }

    public void setBall_stop(boolean ball_stop) {
        this.ball_stop = ball_stop;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }
    public void setOffset(float offset) {
        this.offset = offset;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void setSpeed(int speed) {
        if(speed > 0)
            speed *=-1;
        if(speed<-25)
            this.speed=25;
        else
            this.speed=speed;
    }
    public void setRebound(int rebound) { this.rebound=rebound; }

    public int getSpeed() { return speed; }
    public boolean getBall_stop() { return ball_stop; }
    public int getRebound() { return rebound; }
    public float getX() { return x; }

    public float getY() {
        return y;
    }

    public float getDx() {
        return dx;
    }
    public float getOffset() {
        return offset;
    }

    public float getDy() {
        return dy;
    }

    public float getRadius() {
        return radius;
    }

    public Ball(float x, float y, float dx, float dy, float radius) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radius = radius;
        this.speed = 0;
        this.rebound = 0;
        this.offset=0;
        this.ball_stop=false;
    }
}

