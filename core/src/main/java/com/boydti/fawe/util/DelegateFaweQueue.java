package com.boydti.fawe.util;

import com.boydti.fawe.object.FaweChunk;
import com.boydti.fawe.object.FaweQueue;
import com.boydti.fawe.object.RunnableVal2;
import com.boydti.fawe.object.exception.FaweException;
import com.sk89q.jnbt.CompoundTag;
import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.world.biome.BaseBiome;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;

public class DelegateFaweQueue extends FaweQueue {
    private final FaweQueue parent;

    public DelegateFaweQueue(FaweQueue parent) {
        super(parent.getWorldName());
        this.parent = parent;
    }

    @Override
    public String getWorldName() {
        return parent.getWorldName();
    }

    @Override
    public void addEditSession(EditSession session) {
        parent.addEditSession(session);
    }

    @Override
    public void setProgressTracker(RunnableVal2<ProgressType, Integer> progressTask) {
        parent.setProgressTracker(progressTask);
    }

    @Override
    public Set<EditSession> getEditSessions() {
        return parent.getEditSessions();
    }

    @Override
    public LinkedBlockingDeque<EditSession> getSessions() {
        return parent.getSessions();
    }

    @Override
    public void setSessions(LinkedBlockingDeque<EditSession> sessions) {
        parent.setSessions(sessions);
    }

    @Override
    public long getModified() {
        return parent.getModified();
    }

    @Override
    public void setModified(long modified) {
        parent.setModified(modified);
    }

    @Override
    public RunnableVal2<ProgressType, Integer> getProgressTask() {
        return parent.getProgressTask();
    }

    @Override
    public void setProgressTask(RunnableVal2<ProgressType, Integer> progressTask) {
        parent.setProgressTask(progressTask);
    }

    @Override
    public void setChangeTask(RunnableVal2<FaweChunk, FaweChunk> changeTask) {
        parent.setChangeTask(changeTask);
    }

    @Override
    public RunnableVal2<FaweChunk, FaweChunk> getChangeTask() {
        return parent.getChangeTask();
    }

    @Override
    public void optimize() {
        parent.optimize();
    }

    @Override
    public boolean setBlock(int x, int y, int z, short id, byte data) {
        return parent.setBlock(x, y, z, id, data);
    }

    @Override
    public void setTile(int x, int y, int z, CompoundTag tag) {
        parent.setTile(x, y, z, tag);
    }

    @Override
    public void setEntity(int x, int y, int z, CompoundTag tag) {
        parent.setEntity(x, y, z, tag);
    }

    @Override
    public void removeEntity(int x, int y, int z, UUID uuid) {
        parent.removeEntity(x, y, z, uuid);
    }

    @Override
    public boolean setBiome(int x, int z, BaseBiome biome) {
        return parent.setBiome(x, z, biome);
    }

    @Override
    public FaweChunk<?> getFaweChunk(int x, int z) {
        return parent.getFaweChunk(x, z);
    }

    @Override
    public void setChunk(FaweChunk<?> chunk) {
        parent.setChunk(chunk);
    }

    @Override
    public boolean fixLighting(FaweChunk<?> chunk, RelightMode mode) {
        return parent.fixLighting(chunk, mode);
    }

    @Override
    public boolean isChunkLoaded(int x, int z) {
        return parent.isChunkLoaded(x, z);
    }

    @Override
    public boolean regenerateChunk(int x, int z) {
        return parent.regenerateChunk(x, z);
    }

    @Override
    public void startSet(boolean parallel) {
        parent.startSet(parallel);
    }

    @Override
    public void endSet(boolean parallel) {
        parent.endSet(parallel);
    }

    @Override
    public int cancel() {
        return parent.cancel();
    }

    @Override
    public FaweChunk next() {
        return parent.next();
    }

    @Override
    public void saveMemory() {
        parent.saveMemory();
    }

    @Override
    public void sendChunk(FaweChunk chunk, RelightMode mode) {
        parent.sendChunk(chunk, mode);
    }

    @Override
    public void clear() {
        parent.clear();
    }

    @Override
    public void addNotifyTask(int x, int z, Runnable runnable) {
        parent.addNotifyTask(x, z, runnable);
    }

    @Override
    public void addNotifyTask(Runnable runnable) {
        parent.addNotifyTask(runnable);
    }

    @Override
    public int getCombinedId4Data(int x, int y, int z) throws FaweException.FaweChunkLoadException {
        return parent.getCombinedId4Data(x, y, z);
    }

    @Override
    public CompoundTag getTileEntity(int x, int y, int z) throws FaweException.FaweChunkLoadException {
        return parent.getTileEntity(x, y, z);
    }

    @Override
    public int getCombinedId4Data(int x, int y, int z, int def) {
        return parent.getCombinedId4Data(x, y, z, def);
    }

    @Override
    public int getCombinedId4DataDebug(int x, int y, int z, int def, EditSession session) {
        return parent.getCombinedId4DataDebug(x, y, z, def, session);
    }

    @Override
    public int size() {
        return parent.size();
    }

    @Override
    public void enqueue() {
        parent.enqueue();
    }
}
