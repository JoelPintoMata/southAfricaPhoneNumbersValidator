package com.example.codechallenge.storage;

import com.example.codechallenge.validation.Validation;

/**
 * Interface for a storage service
 */
public interface StorageService {

    /**
     * Loads a file from the storage and returns its contents as a string
     * @param filename the name of the file to load
     * @return a string representing the contents of the stored file
     * @throws StorageException
     */
    String load(String filename) throws StorageException;

    /**
     * Stores the result of a validation procedure
     * @param validation the results of the validation procedure
     * @throws StorageException
     */
    void store(Validation validation) throws StorageException;
}