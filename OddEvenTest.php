<?php

use PHPUnit\Framework\TestCase;

class OddEvenTest extends TestCase
{
    private $result;

    protected function setUp(): void
    { {
            $this->result = true;
        }
    }
    public function testFalse(): void
    { {
            $this->result = false;
            $this->assertFalse($this->result);
            // $this->assertNotEquals(0, $this->result % 2);
        }
    }
    public function testTrue(): void
    { {
            $this->assertTrue($this->result);
            // $this->assertEquals(0, $this->result % 2);
        }
    }


    protected function tearDown(): void
    { {
            $this->result = null;
        }
    }
}
