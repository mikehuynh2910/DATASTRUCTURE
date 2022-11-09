

	public class CanHuynh implements Comparable<CanHuynh> {

		private String company;

		private String content;

		private double size;

		private double price;

		public CanHuynh(String company, String content, double size, double price) {

		this.company = company;

		this.content = content;

		this.size = size;

		this.price = price;

		}

		public CanHuynh(String company, String content) {

		this.company = company;

		this.content = content;

		this.size = 0;

		this.price = 0;

		}

		public String getCompany() {

		return company;

		}

		public void setCompany(String company) {

		this.company = company;

		}

		public String getContent() {

		return content;

		}

		public void setContent(String content) {

		this.content = content;

		}

		public double getSize() {

		return size;

		}

		public void setSize(double size) {

		this.size = size;

		}

		public double getPrice() {

		return price;

		}

		public void setPrice(double price) {

		this.price = price;

		}

		

		public String toString() {


		return "[Company=" + company + ", " + "Content=" + content + ", " + "Size=" + size + ", " + "Price=" + price + "]";

		}

		

		public int compareTo(CanHuynh o) {

		if(company.equals(o.company) && content.equals(o.content) && size == o.size && price == o.price)

		return 0;

		else return -1;

		}

		}

