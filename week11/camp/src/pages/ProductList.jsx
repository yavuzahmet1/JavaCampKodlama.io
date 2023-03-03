import React, { useEffect, useState } from 'react'
import { Icon, Menu, Table } from 'semantic-ui-react'
import ProductService from '../layouts/ProductServices';

export default function ProductList() {

  const [products, setProducts] = useState([]);

  useEffect(() => {
    let productService=new ProductService()
  
    productService.getProducts().then(result=>setProducts(result.data.data))
  
  })
  
  return (
    <div>
      <Table celled>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>Name</Table.HeaderCell>
          </Table.Row>
        </Table.Header>

        <Table.Body>
          {products.map((product) => (
              <Table.Row key={0}>
              <Table.Cell>{product.name}</Table.Cell>
            </Table.Row>
            ))}
        </Table.Body>

        <Table.Footer>
          <Table.Row>
            <Table.HeaderCell colSpan='3'>
              <Menu floated='right' pagination>
                <Menu.Item as='a' icon>
                  <Icon name='chevron left' />
                </Menu.Item>
                <Menu.Item as='a'>1</Menu.Item>
                <Menu.Item as='a'>2</Menu.Item>
                <Menu.Item as='a'>3</Menu.Item>
                <Menu.Item as='a'>4</Menu.Item>
                <Menu.Item as='a' icon>
                  <Icon name='chevron right' />
                </Menu.Item>
              </Menu>
            </Table.HeaderCell>
          </Table.Row>
        </Table.Footer>
      </Table>
    </div>
  )
}
