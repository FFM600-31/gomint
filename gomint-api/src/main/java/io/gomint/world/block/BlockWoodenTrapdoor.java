/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.world.block;

import io.gomint.world.block.data.LogType;

/**
 * @author geNAZt
 * @version 1.0
 */
public interface BlockWoodenTrapdoor extends BlockTrapdoor {

    /**
     * Get the type of wood from which this button has been made
     *
     * @return type of wood
     */
    LogType getWoodType();

    /**
     * Set the type of wood for this button
     *
     * @param logType type of wood
     */
    void setWoodType(LogType logType);

}
