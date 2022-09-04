package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
//generic yapmamızın sebebi; ben category id, veya product name vb verileri elde etmem için
//veri istemem gerekecek çok çeşilti isteğim olabileceğimden burayı generik tanımladık
	private T data;

	public DataResult(T data, boolean success, String message) {
		super(success, message);// super base sınıfınını set eden constrıtırı var.
								// base sınıfa yollamış oluyorum.
		this.data = data;
	}

	public DataResult(T data, boolean success) {
		super(success);// message yollamak zorunda kalmamak için bu constructeri ekledik

		this.data = data;
	}

	public T getData() {
		return this.data;
	}

}
