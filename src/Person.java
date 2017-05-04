
class Person {
		private float _height;
		private float _weight;
		private String _name;

		public float getHeight() {
			return this._height;
		}

		public void setHeight(float height) {
			this._height = height;
		}

		public Person(String name, float weight) {
			this._height = 6;
			this._weight = weight;
			this._name = name;
		}
		
		public void walks() {
			this._weight *= 0.9;
			System.out.println(this._name + " lost weight!");
			System.out.println(this._name + " weighs: " + this._weight + " lbs");
		}

		public void eats() {
			this._weight *= 1.20;
			System.out.println(this._name + " gained weight!");
			System.out.println(this._name + " weighs: " + this._weight + " lbs");
		}
	}