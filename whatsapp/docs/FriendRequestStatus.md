
# FriendRequestStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The friend request status UUID. |  [optional]
**friendRequestId** | [**UUID**](UUID.md) | The UUID of the related friend request. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the friend request. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the friend request status was last updated. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
ACCEPTED | &quot;accepted&quot;
REJECTED | &quot;rejected&quot;
CANCELLED | &quot;cancelled&quot;



