# EmployeesApi

All URIs are relative to *https://mg-eval-test.apigee.net/demo/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeesEmployeeIDDelete**](EmployeesApi.md#employeesEmployeeIDDelete) | **DELETE** /employees/{employeeID} | Deletes an Employee record
[**employeesEmployeeIDGet**](EmployeesApi.md#employeesEmployeeIDGet) | **GET** /employees/{employeeID} | Retrieves an Employee record
[**employeesGet**](EmployeesApi.md#employeesGet) | **GET** /employees | Retrieves all Employee records
[**employeesPost**](EmployeesApi.md#employeesPost) | **POST** /employees | Creates an Employees


<a name="employeesEmployeeIDDelete"></a>
# **employeesEmployeeIDDelete**
> employeesEmployeeIDDelete(employeeID)

Deletes an Employee record

Deletes the profile of an employee.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EmployeesApi apiInstance = new EmployeesApi();
Integer employeeID = 56; // Integer | The unique ID of employee.
try {
    apiInstance.employeesEmployeeIDDelete(employeeID);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeesApi#employeesEmployeeIDDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeID** | **Integer**| The unique ID of employee. |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="employeesEmployeeIDGet"></a>
# **employeesEmployeeIDGet**
> Employee employeesEmployeeIDGet(employeeID)

Retrieves an Employee record

Retrieves the profile of an employee.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EmployeesApi apiInstance = new EmployeesApi();
Integer employeeID = 56; // Integer | The unique ID of employee.
try {
    Employee result = apiInstance.employeesEmployeeIDGet(employeeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeesApi#employeesEmployeeIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeID** | **Integer**| The unique ID of employee. |

### Return type

[**Employee**](Employee.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="employeesGet"></a>
# **employeesGet**
> ERRORUNKNOWN employeesGet()

Retrieves all Employee records

Retrieves the profile of all employees.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EmployeesApi apiInstance = new EmployeesApi();
try {
    ERRORUNKNOWN result = apiInstance.employeesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeesApi#employeesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ERRORUNKNOWN**](ERRORUNKNOWN.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="employeesPost"></a>
# **employeesPost**
> employeesPost(employee)

Creates an Employees

Registers a new employee for the client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmployeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EmployeesApi apiInstance = new EmployeesApi();
Employee employee = new Employee(); // Employee | The Employee
try {
    apiInstance.employeesPost(employee);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeesApi#employeesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | [**Employee**](Employee.md)| The Employee | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

