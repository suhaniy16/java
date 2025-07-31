import numpy as np

# Sigmoid function
def sigmoid(x):
    return 1 / (1 + np.exp(-x))

# Input datasets
inputs = np.array([[0, 0], [0, 1], [1, 0], [1, 1]])

# Weights initialization
weights0 = np.array([[0.5, 0.6], [0.7, 0.8]])
weights1 = np.array([[0.9], [1.0]])

# Bias initialization
bias0 = np.array([0.1, 0.2])
bias1 = np.array([0.3])

# Feedforward propagation
def feedforward_propagation(inputs, weights0, weights1, bias0, bias1):
    # Layer 0 (input layer)
    layer0 = inputs

    # Layer 1 (hidden layer)
    layer1 = sigmoid(np.dot(layer0, weights0) + bias0)

    # Layer 2 (output layer)
    layer2 = sigmoid(np.dot(layer1, weights1) + bias1)

    return layer0, layer1, layer2

# Run feedforward propagation
layer0, layer1, layer2 = feedforward_propagation(inputs, weights0, weights1, bias0, bias1)

# Print outputs
print("Inputs:")
print(layer0)
print("\nHidden layer outputs:")
print(layer1)
print("\nOutput layer outputs:")
print(layer2)
