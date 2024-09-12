Assumptions and Design Decisions:

* The `Operation` enum is used to define the supported operations.
* The `Calculator` class uses a map to store the operation strategies, allowing for easy addition of new operations.
* The `OperationStrategy` interface defines the execute method, which is implemented by concrete strategy classes.
* The `chainOperations` method allows for chaining multiple operations on a single value.
* Unit tests cover basic operations, chaining operations, and unsupported operations.