import numpy as np

class Perceptron:
    def __init__(self, learning_rate=0.01, num_iterations=1000):
        self.learning_rate = learning_rate
        self.num_iterations = num_iterations
        self.weights = None
        self.bias = None

    def fit(self, X, y):
        num_samples, num_features = X.shape
        self.weights = np.zeros(num_features)
        self.bias = 0

        for _ in range(self.num_iterations):
            for i in range(num_samples):
                linear_output = np.dot(X[i], self.weights) + self.bias
                predicted_class = np.where(linear_output >= 0, 1, 0)

                update = self.learning_rate * (y[i] - predicted_class)
                self.weights += update * X[i]
                self.bias += update

    def predict(self, X):
        linear_output = np.dot(X, self.weights) + self.bias
        predicted_class = np.where(linear_output >= 0, 1, 0)
        return predicted_class

# AND gate
X_and = np.array([[0, 0], [0, 1], [1, 0], [1, 1]])
y_and = np.array([0, 0, 0, 1])

# OR gate
X_or = np.array([[0, 0], [0, 1], [1, 0], [1, 1]])
y_or = np.array([0, 1, 1, 1])

# XOR gate (Note: A single Perceptron cannot learn XOR)
X_xor = np.array([[0, 0], [0, 1], [1, 0], [1, 1]])
y_xor = np.array([0, 1, 1, 0])

# Train and test the Perceptron for AND gate
perceptron_and = Perceptron()
perceptron_and.fit(X_and, y_and)
print("AND gate predictions:", perceptron_and.predict(X_and))

# Train and test the Perceptron for OR gate
perceptron_or = Perceptron()
perceptron_or.fit(X_or, y_or)
print("OR gate predictions:", perceptron_or.predict(X_or))

# Train and test the Perceptron for XOR gate (will not work correctly)
perceptron_xor = Perceptron()
perceptron_xor.fit(X_xor, y_xor)
print("XOR gate predictions:", perceptron_xor.predict(X_xor))


