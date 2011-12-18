package org.getspout.api.geo.cuboid;

import org.getspout.api.geo.World;

/**
 * Represents a movable cube containing 16x16x16 Chunks (256x256x256 Blocks)
 */
public class Regionm extends Region implements MovableCuboid {
	
	public Regionm(World world, double x, double y, double z) {
		super(world, x, y, z);
	}
	
	public void setX(int x) {
		base.setX(x * size.getX());
	}

	public void setY(int y) {
		base.setY(y * size.getY());
	}

	public void setZ(int z) {
		base.setZ(z * size.getZ());
	}

}
