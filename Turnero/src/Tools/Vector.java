package Tools;

public class Vector {
	// Step 1. Create attributes
		private int size;
		private int[] elements;

		// Create constructor
		public Vector(int newSize) {
			this.size = newSize;
			this.elements = new int[newSize];
		}

		// Step 2. Create methods
		// Step 2.1. Generate encapsulation methods
		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public int[] getElements() {
			return elements;
		}

		public void setElements(int[] elements) {
			this.elements = elements;
		}

		// Step 2.2. Create CRUD methods
		public int[] insertElement(int element, int position) {
			this.elements[position] = element;
			return this.elements;
		}

		public int searchElementbyPosition(int position) {
			return this.elements[position];
		}

		public int searchElementbyValue(int value) {
			int position = -1;
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == value)
					position = i;
			}
			return position;
		}

		public String listElement(int[] elements) {
			String vector = "";
			for (int i = 0; i < elements.length; i++) {
				if (i != elements.length - 1) {
					vector += this.elements[i] + " ";

				} else {
					vector += this.elements[i];
				}
			}
			return vector;
		}

		public int[] updateElement(int element, int position) {
			this.elements[position] = element;
			return this.elements;
		}

		public int[] deleteElement(int value) {
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == value)
					elements[i] = 0;
			}
			return this.elements;
		}

}
