package pl.sternik.kk.sklep;

public interface Streamable extends Downloadable {

    public byte[] nextPacket();
}
