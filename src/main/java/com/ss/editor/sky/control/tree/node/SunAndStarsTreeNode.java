package com.ss.editor.sky.control.tree.node;

import com.ss.editor.annotation.FromAnyThread;
import com.ss.editor.annotation.FxThread;
import com.ss.editor.ui.Icons;
import com.ss.editor.ui.control.tree.node.TreeNode;
import javafx.scene.image.Image;
import jme3utilities.sky.SunAndStars;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The tree node to present {@link SunAndStars} in model tree.
 *
 * @author JavaSaBr
 */
public class SunAndStarsTreeNode extends TreeNode<SunAndStars> {

    public SunAndStarsTreeNode(@NotNull final SunAndStars element, final long objectId) {
        super(element, objectId);
    }

    @Override
    @FromAnyThread
    public @NotNull String getName() {
        return "Sun and stars";
    }

    @Override
    @FxThread
    public @Nullable Image getIcon() {
        return Icons.SETTINGS_16;
    }
}