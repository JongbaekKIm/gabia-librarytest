package gabia.library.mapper;

import gabia.library.domain.book.Book;
import gabia.library.domain.rent.Rent;
import gabia.library.dto.BookResponseDto;
import gabia.library.dto.BookResponseDto.BookResponseDtoBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-23T11:22:02+0900",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.14 (Eclipse Adoptium)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public BookResponseDto bookToBookResponseDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookResponseDtoBuilder bookResponseDto = BookResponseDto.builder();

        bookResponseDto.identifier( book.getIdentifier() );
        bookResponseDto.thumbnail( book.getThumbnail() );
        bookResponseDto.author( book.getAuthor() );
        bookResponseDto.publishDate( book.getPublishDate() );
        bookResponseDto.extensionCount( book.getExtensionCount() );
        bookResponseDto.isRent( book.isRent() );
        bookResponseDto.title( book.getTitle() );
        bookResponseDto.content( book.getContent() );
        bookResponseDto.referenceUrl( book.getReferenceUrl() );
        bookResponseDto.createdDate( book.getCreatedDate() );
        bookResponseDto.etc( book.getEtc() );
        bookResponseDto.reviewCount( book.getReviewCount() );
        bookResponseDto.intro( book.getIntro() );
        bookResponseDto.modifiedDate( book.getModifiedDate() );
        bookResponseDto.publisher( book.getPublisher() );
        bookResponseDto.location( book.getLocation() );
        bookResponseDto.id( book.getId() );
        bookResponseDto.category( book.getCategory() );
        bookResponseDto.rentId( book.getRentId() );
        bookResponseDto.rentExpiredDate( book.getRentExpiredDate() );

        return bookResponseDto.build();
    }

    @Override
    public BookResponseDto bookToBookAndRentResponseDto(Book book, Rent rent) {
        if ( book == null && rent == null ) {
            return null;
        }

        BookResponseDtoBuilder bookResponseDto = BookResponseDto.builder();

        if ( book != null ) {
            bookResponseDto.identifier( book.getIdentifier() );
            bookResponseDto.thumbnail( book.getThumbnail() );
            bookResponseDto.author( book.getAuthor() );
            bookResponseDto.publishDate( book.getPublishDate() );
            bookResponseDto.extensionCount( book.getExtensionCount() );
            bookResponseDto.isRent( book.isRent() );
            bookResponseDto.title( book.getTitle() );
            bookResponseDto.content( book.getContent() );
            bookResponseDto.referenceUrl( book.getReferenceUrl() );
            bookResponseDto.createdDate( book.getCreatedDate() );
            bookResponseDto.etc( book.getEtc() );
            bookResponseDto.reviewCount( book.getReviewCount() );
            bookResponseDto.intro( book.getIntro() );
            bookResponseDto.modifiedDate( book.getModifiedDate() );
            bookResponseDto.publisher( book.getPublisher() );
            bookResponseDto.location( book.getLocation() );
            bookResponseDto.rentExpiredDate( book.getRentExpiredDate() );
            bookResponseDto.id( book.getId() );
            bookResponseDto.category( book.getCategory() );
        }
        if ( rent != null ) {
            bookResponseDto.rentId( rent.getId() );
        }

        return bookResponseDto.build();
    }
}
