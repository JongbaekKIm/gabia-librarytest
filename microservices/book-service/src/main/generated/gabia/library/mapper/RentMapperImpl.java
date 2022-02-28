package gabia.library.mapper;

import gabia.library.domain.book.Book;
import gabia.library.domain.rent.Rent;
import gabia.library.dto.RentResponseDto;
import gabia.library.dto.RentResponseDto.RentResponseDtoBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T11:22:02+0900",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.14 (Eclipse Adoptium)"
)
public class RentMapperImpl implements RentMapper {

    @Override
    public RentResponseDto rentToRentResponseDto(Rent rent) {
        if ( rent == null ) {
            return null;
        }

        RentResponseDtoBuilder rentResponseDto = RentResponseDto.builder();

        rentResponseDto.rentStatus( rent.getRentStatus() );
        rentResponseDto.identifier( rent.getIdentifier() );
        rentResponseDto.rentExpiredDate( rent.getRentExpiredDate() );
        rentResponseDto.id( rent.getId() );
        rentResponseDto.bookAuthor( rent.getBookAuthor() );
        rentResponseDto.bookId( rent.getBookId() );
        rentResponseDto.bookTitle( rent.getBookTitle() );

        return rentResponseDto.build();
    }

    @Override
    public RentResponseDto bookToRentResponseDto(Book book) {
        if ( book == null ) {
            return null;
        }

        RentResponseDtoBuilder rentResponseDto = RentResponseDto.builder();

        rentResponseDto.bookAuthor( book.getAuthor() );
        rentResponseDto.bookId( book.getId() );
        rentResponseDto.bookTitle( book.getTitle() );
        rentResponseDto.id( book.getId() );
        rentResponseDto.identifier( book.getIdentifier() );
        rentResponseDto.rentExpiredDate( book.getRentExpiredDate() );

        return rentResponseDto.build();
    }
}
