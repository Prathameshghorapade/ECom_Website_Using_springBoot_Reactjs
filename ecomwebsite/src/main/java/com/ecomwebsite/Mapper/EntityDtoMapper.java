package com.ecomwebsite.Mapper;

import com.ecomwebsite.DTO.*;
import com.ecomwebsite.Entity.*;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class EntityDtoMapper {

 // User Entity To UserDto

    public UserDto mapUserToDtoBasic(User user){

        UserDto userDto = new UserDto();
        userDto.setUserId(user.getUserId());
        userDto.setPhoneNumber(String.valueOf(user.getPhoneNumber()));
        userDto.setRole(user.getRole());
        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        return userDto;
    }

    // Address To Dto Basic


    public AddressDto mapAddressToDtoBasic(Address address){

        AddressDto addressDto = new AddressDto();
        addressDto.setAddressId(address.getAddressId());
        addressDto.setCity(address.getCity());
        addressDto.setCountry(address.getCountry());
        addressDto.setStreet(address.getStreet());
        addressDto.setPinCode(address.getPinCode());
        return addressDto;
    }



    // Category To Dto Basic

    public CategoryDto mapCategoryToDtoBasic(Category category){

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setCategoryId(category.getCategoryId());
        categoryDto.setCategoryName(category.getCategoryName());
        return categoryDto;
    }


    // OrderItem To Dto Basic


    public OrderItemDto mapOrderToDtoBasic(OrderItem orderItem){

        OrderItemDto orderItemDto = new OrderItemDto();
       orderItemDto.setOrderItemId(orderItem.getOrderItemId());
       orderItemDto.setQuantity(orderItem.getQuantity());
       orderItemDto.setPrice(orderItem.getPrice());
       orderItemDto.setStatus(orderItem.getStatus());
       orderItemDto.setCreatedAt(orderItem.getCreatedAt());
        return orderItemDto;
    }


    // Product to Dto Basic


    public ProductDto mapProductToDtoBasic(Product product){

        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setDescription(product.getDescription());
        productDto.setImgUrl(product.getImgUrl());
         productDto.setPrice(productDto.getPrice());
         return productDto;

    }


    public UserDto mapUserToDtoPluseAddress(User user){

        UserDto userDto = new UserDto();
       if(user.getAddress() != null){
           AddressDto addressDto = mapAddressToDtoBasic(user.getAddress());
           userDto.setAddress(addressDto);
       }

       return userDto;

    }




    // OrderItem To Dto Plus Product

    public OrderItemDto mapOrderItemToDtoPluseProduct(OrderItem orderItem){

        OrderItemDto orderItemDto = mapOrderToDtoBasic(orderItem);

        if(orderItemDto.getProduct() != null){
        ProductDto productDto = mapProductToDtoBasic(orderItem.getProduct());
        orderItemDto.setProduct(productDto);

        }

        return orderItemDto;
    }



    // OrderItem To Dto Plus Product amd User


    public OrderItemDto mapOrderItemToDtoPluseProductAndUser(OrderItem orderItem){

        OrderItemDto orderItemDto = mapOrderItemToDtoPluseProduct(orderItem);

        if (orderItemDto.getUser() != null){

            UserDto userDto = mapUserToDtoPluseAddress(orderItem.getUser());
            orderItemDto.setUser(userDto);
        }

        return orderItemDto;
    }



    // User To Dto with Address And OrderItem History

    public UserDto mapUserToDtoPlusAddressAndOrderHistory(User user){

        UserDto userDto = mapUserToDtoPluseAddress(user);

        if(user.getOrderItemList() != null && !user.getOrderItemList().isEmpty()){


      userDto.setOrderItemList(user.getOrderItemList()

              .stream().map(this :: mapOrderItemToDtoPluseProduct).collect(Collectors.toList()));

        }

        return userDto;
    }

    









}
